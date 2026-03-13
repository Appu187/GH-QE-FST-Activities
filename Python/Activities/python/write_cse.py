import pandas

data = {
    "Vehicle Type": ["Car", "Car", "Bike"],
    "Manufacturer": ["Maruti", "Toyota", "Royal Enfield"],
    "Model": ["Swift", "Corolla", "Thunderbird"]
}

dataframe = pandas.DataFrame(data)

dataframe.to_csv("vehicles.csv")