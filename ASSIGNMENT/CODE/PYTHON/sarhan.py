import csv

def searchByDescription():

	 description=str(input('Enter Description:'))
	 csv_file=csv.reader(open('survey-2018-nature-of-work-csv.csv','r'))

	 for row in csv_file:
          if description==row[0]:
          	print(row)

def searchByIndustry():

	 industry=str(input('Enter Industry Name:'))
	 csv_file=csv.reader(open('survey-2018-nature-of-work-csv.csv','r'))

	 for row in csv_file:
          if industry==row[1]:
          	print(row)

def searchByLevel():
	 level=input('Enter Level:')
	 csv_file=csv.reader(open('survey-2018-nature-of-work-csv.csv','r'))

	 for row in csv_file:
          if level==row[2]:
          	print(row)

def searchBySize():
	 size=input('Enter Size:')
	 csv_file=csv.reader(open('survey-2018-nature-of-work-csv.csv','r'))

	 for row in csv_file:
          if size==row[3]:
          	print(row)

def searchByLineCode():
	 linecode=input('Enter Line Code:')
	 csv_file=csv.reader(open('survey-2018-nature-of-work-csv.csv','r'))

	 for row in csv_file:
          if linecode==row[4]:
          	print(row)

def searchByValue():
	 value=input('Enter Value:')
	 csv_file=csv.reader(open('survey-2018-nature-of-work-csv.csv','r'))

	 for row in csv_file:
          if value==row[5]:
          	print(row)

print('Enter 1 to Search By Description')
print('Enter 2 to Search By Industry Name')
print('Enter 3 to Search By Level')
print('Enter 4 to Search By Size')
print('Enter 5 to Search By Line Code')
print('Enter 6 to Search By Value')

src=int(input('Enter: '))


if src==1:
    searchByDescription()
elif src==2:
    searchByIndustry()
elif src==3:
     searchByLevel()
elif src==4:
     searchBySize()
elif src==5:
     searchByLineCode()
elif src==6:
     searchByValue()
else: print('Invalid Input.')



