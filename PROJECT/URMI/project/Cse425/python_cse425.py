import csv
ifile  = open('data1.csv', "rt", encoding='UTF8')
print("Press 1 to search by Year \n" +
      "Press 2 to search by STATE \n"+
      "Press 3 to search by Deaths \n")

#Determine the users choice
val = int(input("Enter your choice: "))

# Search details by YEAR
if(val == 1):
    number = input('Enter year(yyyy):') 
    if(len(number) > 0):
        read = csv.reader(ifile)
        for row in read :
            if(number in row[0]):
                 print(row)
    else:
        print("The data doesn't exist")

# Search details by State
elif(val == 2):
    number = input('Enter state:') 
    if(len(number) > 0):
        read = csv.reader(ifile)
        for row in read :
            if(number in row[3]):
                 print(row)
    else:
        print("The data doesn't exist")


# Search details by Deaths
elif(val == 3):
    number = input('Enter Deaths:') 
    if(len(number) > 0):
        read = csv.reader(ifile)
        for row in read :
            if(number in row[4]):
                 print(row)
                
    else:
        print("The data doesn't exist")


else:
    print("Enter a valid number")
