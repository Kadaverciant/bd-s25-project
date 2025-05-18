import calendar
import functools
import json
import re
import warnings
from collections import Counter

import numpy as np
import pandas as pd
from tqdm import tqdm

warnings.filterwarnings("ignore")


df = pd.read_csv("./data/total_data.csv")

with open("./scripts/project_data_desc.json", encoding="utf-8") as f:
    headers_json = json.load(f)
headers = [*list(map(str, headers_json)), "month"]
headers_set = set(headers)

df = df[headers].dropna(
    subset=(
        headers_set
        - {
            "host_response_time",
            "host_response_rate",
            "security_deposit",
            "cleaning_fee",
        }
    ),
)

df = df[headers].drop_duplicates()


df["host_response_rate"] = df["host_response_rate"].str.rstrip("%")

price_columns = ["price", "security_deposit", "cleaning_fee", "extra_people"]
for col in price_columns:
    df[col] = (
        df[col]
        .astype(str)
        .str.replace(r"[^\d.]", "", regex=True)
        .replace("", np.nan)
        .astype(float)
    )

int_columns = ["bedrooms", "beds"]
df[int_columns] = df[int_columns].astype("Int64")


amenity_cleaner = re.compile(r'[{}"]')

clean_amenities = (
    df["amenities"].astype(str).str.replace(amenity_cleaner, "", regex=True)
)
split_amenities = clean_amenities.str.split(",")

c = Counter()
split_amenities.dropna().apply(c.update)

features = [k for k, _ in c.most_common(20)]


def add_feature(feat, x):
    return feat in x if isinstance(x, list) else False


for feature in tqdm(features):
    df[feature] = split_amenities.apply(functools.partial(add_feature, feature))


AMENITY_PATTERN = re.compile(r'"([^"]+)"|([^,{}"]+)')


def extract_amenities_fast(series: pd.Series) -> pd.Series:
    stripped = series.astype(str).str.strip("{}")

    return stripped.map(
        lambda x: ", ".join(
            m.group(1) or m.group(2) for m in AMENITY_PATTERN.finditer(x)
        ),
    )


df["amenities"] = extract_amenities_fast(df["amenities"])

month_map = {i: calendar.month_name[i].lower() for i in range(1, 13)}
df["month"] = df["month"].map(month_map)

df = df.fillna(
    {
        "host_response_time": "unknown",
        "host_response_rate": 0,
        "security_deposit": 0.0,
        "cleaning_fee": 0.0,
        "amenities": "",
    },
)

df.to_csv("./data/cleaned.csv", index=False)
