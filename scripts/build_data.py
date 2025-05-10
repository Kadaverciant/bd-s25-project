import json
import warnings
import pandas as pd
import re
from collections import Counter
from tqdm import tqdm

warnings.filterwarnings('ignore')

print("Start loading data")
df_s = pd.read_csv("./data/setembro2019.csv")
df_s['month'] = "september"
df_o = pd.read_csv("./data/outubro2019.csv")
df_o['month'] = "october"
df_n = pd.read_csv("./data/novembro2019.csv")
df_n['month'] = "november"
df_d = pd.read_csv("./data/dezembro2019.csv")
df_d['month'] = "december"
df_j = pd.read_csv("./data/janeiro2020.csv")
df_j['month'] = "january"
df_f = pd.read_csv("./data/fevereiro2020.csv")
df_f['month'] = "february"
df_m = pd.read_csv("./data/maro2020.csv")
df_m['month'] = "march"
df_a = pd.read_csv("./data/abril2020.csv")
df_a['month'] = "april"
df_may = pd.read_csv("./data/maio2020.csv")
df_may['month'] = "may"
df = pd.concat([df_s, df_o, df_n, df_d, df_j, df_f, df_m, df_a, df_may])
print("Data loaded successfully")

headers_json = json.load(open("./scripts/project_data_desc.json"))
headers = []
for header in headers_json:
    headers.append(str(header))

headers.append("month")

df = df[headers]
df = df.drop_duplicates()
print("Start preprocessing data")
df['host_response_rate'] = df['host_response_rate'].apply(lambda x: str(x)[:-1] if pd.notna(x) else x)

price_columns = ['price', "security_deposit", "cleaning_fee", "extra_people"]
for column in price_columns:
    df[column] = df[column].apply(lambda x: float(str(x)[1:].replace(",", "")) if pd.notna(x) else x)

int_columns = ['bedrooms', "beds"]
for column in int_columns:
    df[column] = df[column].astype('Int64')
print("End preprocessing data")

print("Start parsing attributes")
c = Counter()
for index, row in df.iterrows():
    temp = re.sub('[{}"]', '', row["amenities"])
    c.update(temp.split(","))

features = [x[0] for x in c.most_common(20)]
df[features] = False

for index, row in tqdm(df.iterrows(), total=len(df), desc="Build amenities"):
    temp = re.sub('[{}"]', '', row["amenities"])
    for header in temp.split(","):
        if header in features:
            df.loc[index, header] = True

df.drop(["amenities"], axis=1, inplace=True)
print("Finish parsing attributes")

df.to_csv("./data/cleaned.csv", index=False)
print("Data stored successfully")