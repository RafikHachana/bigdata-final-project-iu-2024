"""
Saves the APU failures to a csv file.
These APU failures are taken from Table II from this paper:
https://www.researchgate.net/profile/Narjes-Davari/publication/355463810_Predictive_maintenance_based_on_anomaly_detection_using_deep_learning_for_air_production_unit_in_the_railway_industry/links/633b0351769781354eb680e1/Predictive-maintenance-based-on-anomaly-detection-using-deep-learning-for-air-production-unit-in-the-railway-industry.pdf
"""

from io import StringIO
import pandas as pd

# Input data as a multiline string
DATA = """
Nr.,Start Time,End Time,dur.(min),severity
#1,4/12/2020 11:50,4/12/2020 23:30,700,high
#2,4/18/2020 00:00,4/18/2020 23:59,1440,high
#3,4/19/2020 00:00,4/19/2020 01:30,90,high
#4,4/29/2020 03:20,4/29/2020 04:00,40,high
#5,4/29/2020 22:00,4/29/2020 22:20,20,high
#6,5/13/2020 14:00,5/13/2020 23:59,599,high
#7,5/18/2020 05:00,5/18/2020 05:30,30,high
#8,5/19/2020 10:10,5/19/2020 11:00,50,high
#9,5/19/2020 22:10,5/19/2020 23:59,109,high
#10,5/20/2020 00:00,5/20/2020 20:00,1200,high
#11,5/23/2020 09:50,5/23/2020 10:10,20,high
#12,5/29/2020 23:30,5/29/2020 23:59,29,high
#13,5/30/2020 00:00,5/30/2020 06:00,360,high
#14,6/01/2020 15:00,6/01/2020 15:40,40,high
#15,6/03/2020 10:00,6/03/2020 11:00,60,high
#16,6/05/2020 10:00,6/05/2020 23:59,839,high
#17,6/06/2020 00:00,6/06/2020 23:59,1439,high
#18,6/07/2020 00:00,6/07/2020 14:30,870,high
#19,7/08/2020 17:30,7/08/2020 19:00,90,high
#20,7/15/2020 14:30,7/15/2020 19:00,270,medium
#21,7/17/2020 04:30,7/17/2020 05:30,60,high
"""

# Use StringIO to simulate a file-like object
data_io = StringIO(DATA)

# Read the data into a DataFrame
df = pd.read_csv(data_io, skiprows=1)

# Strip the hash '#' from the 'Nr.' column
df['Nr.'] = df['Nr.'].str.strip('#')

# change the column names
df.columns = ['event_id', 'start_time', 'end_time', 'duration_minutes', 'severity']


# Save the DataFrame to CSV
df.to_csv('data/apu_failures.csv', index=False)

print("Data has been saved to 'data/apu_failures.csv'")
