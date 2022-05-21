searchByStation(){
echo "Enter station name:"
read Station
grep -i $Station air_quality_Nov2017.csv
echo "Total results found:" 
grep -i -c $Station air_quality_Nov2017.csv
}

searchByDate(){
echo "Enter Date (date/month/year):"
read Generated
grep $Generated air_quality_Nov2017.csv
echo "Total results found:" 
grep -c $Generated air_quality_Nov2017.csv
}

searchByTime(){
echo "Enter Time(hour:min):"
read Generated
grep $Generated air_quality_Nov2017.csv
echo "Total results found:" 
grep -c $Generated air_quality_Nov2017.csv
}

echo "Welcome to Barcelona Air Quality"
echo "Enter your search criteria from below:"
echo "1.Search by Station"
echo "2.Search by Date"
echo "3.Search by Time"
read choice

if [ $choice -eq 1 ]
then 
searchByStation

elif [ $choice -eq 2 ]
then
searchByDate

elif [ $choice -eq 3 ]
then
searchByTime
fi