searchByIndustry(){
echo "Enter Industry Name:"
read industry
grep -i $industry survey-2018-nature-of-work-csv.csv
echo "Total Results Found:" 
grep -i -c $industry survey-2018-nature-of-work-csv.csv
}

searchByLevel(){
echo "Enter Level:"
read level
grep -i $level survey-2018-nature-of-work-csv.csv
echo "Total Results Found:" 
grep -c $level survey-2018-nature-of-work-csv.csv
}

searchByLineCode(){
echo "Enter Line Code:"
read Generated
grep $Generated survey-2018-nature-of-work-csv.csv
echo "Total results found:" 
grep -c $Generated survey-2018-nature-of-work-csv.csv
}

searchByValue(){
echo "Enter Value:"
read Generated
grep $Generated survey-2018-nature-of-work-csv.csv
echo "Total results found:" 
grep -c $Generated survey-2018-nature-of-work-csv.csv
}

echo "Welcome to SURVEY of 2018-NATURE OF WORK"
echo "1.Search by Industry Name"
echo "2.Search by Level"
echo "3.Search by Line Code"
echo "4.Search by Value"
echo "Enter your Search Criteria from below:"
read choice

if [ $choice -eq 1 ]
then 
searchByIndustry

elif [ $choice -eq 2 ]
then
searchByLevel

elif [ $choice -eq 3 ]
then
searchByLineCode

elif [ $choice -eq 4 ]
then
searchByValue
fi