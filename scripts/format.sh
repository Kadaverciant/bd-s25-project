#!/bin/bash

echo "Start ruff"
python3.11 -m ruff check --fix --unsafe-fixes --select ALL,I001 --fixable ALL .
python3.11 -m ruff format .

echo "Done!"