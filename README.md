# Solving Cold Start Problem for New Booking Aggregator

![Python](https://img.shields.io/badge/python-3.11-blue.svg)
![Ruff](https://img.shields.io/badge/style-ruff-%23cc66cc.svg?logo=ruff&logoColor=white)
![Shell](https://img.shields.io/badge/shell-scripts-yellow.svg)
![SQL](https://img.shields.io/badge/sql-hive%2Fstandard-red.svg)

An **S25 Big Data Project**

---

## Table of Contents

- [Contributors](#contributors)
- [Requirements](#requirements)
- [Before You Start](#before-you-start)
- [Quick Start](#quick-start)
- [Repository Structure](#repository-structure)
- [Contact](#contact)
- [References](#references)

---

## Contributors

- Dmitry Beresnev — [d.beresnev@innopolis.university](mailto:d.beresnev@innopolis.university)
- Vsevolod Klyushev — [v.klyushev@innopolis.university](mailto:v.klyushev@innopolis.university)
- Nikita Yaneev — [n.yaneev@innopolis.university](mailto:n.yaneev@innopolis.university)

---

## Requirements

- Tested on **Linux**
- Requires **Python 3.11+**
- Requires **HDFS** and **Hive/SQL engines**

---

## Before You Start

Ensure you have added your PostgreSQL password to `secrets/.psql.pass`

Make sure you have:

- Hive/SQL environment configured
- HDFS available and running if needed

---

## Quick Start

You can start via one simple command:

```bash
bash scripts/main.sh
```

---

## Repository Structure

```text
.
├── data/
│   └── .gitignore                 # Ignore large raw data files
│
├── output/                        # Output results, plots and images
│   ├── codegen_records.java
│   ├── evaluation.csv             # Solution metrics
│   ├── model1_predictions.csv     # Predictions of Linear regression
│   ├── model2_predictions.csv     # Predictions of Random Forest regressor
│   ├── q1_*.jpg to q7_*.jpg       # Insight plots
│   └── q1.csv to q7.csv           # Insight results
│
├── report/
│   ├── report.tex
│   └── report.pdf                  # Project report in PDF format
│
├── scripts/
│   ├── app.py                     # Model pipeline
│   ├── build_data.py              # Script to preprocess or construct data
│   ├── build_projectdb.py
│   ├── format.sh                  # Formatting script
│   ├── get_insights.sh            # Runs analytical SQL insights
│   ├── load_data.sh               # Loads data from cloud
│   ├── main.sh                    # Master orchestrator script
│   ├── partition.sh               # Partitions data for Hive
│   ├── prepare_data.ipynb
│   ├── project_data_desc.json     # Data schema and description
│   ├── send_to_hdfs.sh            # HDFS upload script
│   ├── stage1.sh                  # Stage 1 pipeline
│   ├── stage2.sh                  # Stage 2 pipeline
│   └── stage3.sh                  # Stage 3 pipeline
│
├── secrets/                       # Directory for secure configs
│
├── sql/                           # HiveQL and SQL scripts
│   ├── create_tables.hql
│   ├── create_tables.sql
│   ├── import_data.sql
│   ├── partition.hql
│   ├── q1.hql to q7.hql           # Insight-specific queries
│   └── test_database.sql
│
├── .gitignore
├── README.md                      # This file
└── requirements.txt               # Python requirements
```

---

## Contact

If you have any questions, feel free to reach out via the university emails listed above.

## References

- [Raw dataset](https://www.kaggle.com/datasets/hazujaf/airbnb-price-prediction-in-rio-de-janeiro-python?resource=download)
