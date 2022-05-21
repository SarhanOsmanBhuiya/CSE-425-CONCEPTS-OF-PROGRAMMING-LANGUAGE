import csv

def searchByStation():

	 station=str(input('Enter station name\n'))
	 csv_file=csv.reader(open('air_quality_Nov2017.csv','r'))

	 for row in csv_file:
          if station==row[0]:
          	print(row)

def searchByDate():
	 date=input('Enter Date and Time\n')
	 csv_file=csv.reader(open('air_quality_Nov2017.csv','r'))

	 for row in csv_file:
          if date==row[13]:
          	print(row)


print('Enter 1 to search By Station')
print('Enter 2 to search By Date & Time')

src=int(input('enter: '))


if src==1:
    searchByStation()
elif src==2:
     searchByDate()
else: print('Invalid Input.')



