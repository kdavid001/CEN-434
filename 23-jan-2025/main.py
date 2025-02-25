import numpy as np

a  = [1,2,3,4,5]
b = [6,7,8,9,4]

a = np.array(a)
b = np.array(b)

import pymongo

myclient = pymongo.MongoClient("mongodb://localhost:27017/")
mydb = myclient["mydatabase"]
dblist = (myclient.list_database_names())
# if "mydatabase" in dblist:
#     print("the database exist")


#insert into
mycol = mydb["students"]
mydata = {"name": "Queendolin", "rooom_number":"Dorcas A302"}
y = mycol.insert_one(mydata)
print(y)

# mydata2 = [{"name": "korede", "rooom_number":"Daniel E401"}, {"name": "rhema", "rooom_number":"Dorcas D201"}, {"name": "david", "rooom_number":"joseph F101"}, {"name": "Genesis", "rooom_number":"Dorcas A401"}]

# z = mycol.insert_many(mydata2)
# 
myquery = {"name" : "korede"}
myans = mycol.find(myquery)
for n in myans:
    print(n)

myquery = {"name" : "korede"}
