url="https://disk.yandex.ru/d/u8thiV4AI9ocNg"

wget "$(yadisk-direct $url)" -O data/data.zip

unzip data/data.zip -d data/
cp data/bd-data/*.csv data/
rm -rf data/bd-data
rm data/data.zip