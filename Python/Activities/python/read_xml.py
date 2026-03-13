import pandas as pd

# Reading an XML file into a DataFrame
df = pd.read_xml("demo/python/properties.xml")

print(df)