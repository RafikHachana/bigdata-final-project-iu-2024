"""
Splits the MetroPT3.csv dataset file into multiple csv files that are smaller than 100MB.
This enables us to push the data to GitHub, and to use the copy command in SQL.
"""
import pandas as pd

def split_csv(input_file, max_file_size_mb=90, chunk_size=10000):
    """
    Splits a large CSV file into smaller CSV files, each not exceeding a specified size limit.

    Args:
    input_file (str): The path to the input CSV file.
    max_file_size_mb (int): The maximum size in MB for each output file.
    chunk_size (int): Number of rows per chunk to process at a time.
    """
    print("Splitting the dataset into smaller CSV files ...")
    # Define the CSV reader
    reader = pd.read_csv(input_file, chunksize=chunk_size)
    # Initialize variables
    current_part = 1

    # Create a DataFrame to accumulate data
    df_accumulated = pd.DataFrame()

    for chunk in reader:
        # Append chunk to the accumulated DataFrame
        df_accumulated = pd.concat([df_accumulated, chunk], ignore_index=True)

        # Check size in memory (approximation in bytes)
        size_in_memory = df_accumulated.memory_usage(deep=True).sum()
        size_in_mb = size_in_memory / (1024 ** 2)  # Convert bytes to MB

        # If the size exceeds the threshold, write to a new CSV
        if size_in_mb >= max_file_size_mb:
            output_file = f'../data/dataset.part{current_part}.csv'
            df_accumulated.to_csv(output_file, index=False)
            print(f'Written {output_file} of size {size_in_mb:.2f} MB')
            
            # Reset the DataFrame and increment file part counter
            df_accumulated = pd.DataFrame()
            current_part += 1

    # Check if there is any remaining data to write after the loop
    if not df_accumulated.empty:
        output_file = f'../data/dataset.part{current_part}.csv'
        df_accumulated.to_csv(output_file, index=False)
        print(f'Written {output_file} of size {size_in_mb:.2f} MB')

# Usage
split_csv('../data/MetroPT3.csv')
