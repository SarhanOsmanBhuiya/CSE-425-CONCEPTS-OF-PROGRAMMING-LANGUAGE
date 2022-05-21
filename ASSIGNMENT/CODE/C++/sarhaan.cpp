#include <iostream>
#include <string>
#include <fstream>
#include <vector>
#include <sstream>


	using namespace std;


	int main()
	{
	vector<string> description(12832);
	vector<string> industry(12832);
	vector<string> level(12832);
	vector<string> size(12832);
	vector<string> line_code(12832);
	vector<string> value(12832);


	cout<< "1 Search with Description" <<endl;
	cout<< "2 Search with industry" <<endl;
	cout<< "3 Search with level" <<endl;
	cout<< "4 Search with size" <<endl;
	cout<< "5 Search with line_code" <<endl;
	cout<< "6 Search with value" <<endl;

int choice,count;
string Industry,Line_code,Description,Level,Size,Value;

ifstream file ("survey-2018-nature-of-work-csv.csv");
if (!file.is_open())
	cerr << "file not found" ;
while (file.good()){
	for (int i = 0; i <12832; i++)
	{
		getline (file, description[i], ',');
		getline (file, industry[i], ',');
		getline (file, level[i], ',');
		getline (file, size[i], ',');
		getline (file, line_code[i], ',');
		getline (file, value[i], ',');
	}
}


cout<< "Enter choice:";
cin>>choice;



if (choice==1)
{
	cout << "Enter description name:";
	cin >> choice;

for (int j= 0; j < 12832; j++)
{
	if (description[j].find(Description) !=std::string::npos)
	{
		cout << description[j] << industry[j] << level[j] << size[j]
		<< line_code[j] << value[j] ;
		count++;
	}
}
   cout << count ;
}



if (choice==2)
{
	cout << "Enter industry name:";
	cin >> choice;

for (int j= 0; j < 12832; j++)
{
	if (industry[j].find(Industry) !=std::string::npos)
	{
		cout << description[j] << industry[j] << level[j] << size[j]
		<< line_code[j] << value[j] ;
		count++;
	}
}
   cout << count ;
}



if (choice==3)
{
	cout << "Enter level name:";
	cin >> choice;

for (int j= 0; j < 12832; j++)
{
	if (level[j].find(Level) !=std::string::npos)
	{
		cout << description[j] << industry[j] << level[j] << size[j]
		<< line_code[j] << value[j] ;
		count++;
	}
}
   cout << count ;
}

else if (choice==4)
{
	cout << "Enter line_code:";
	cin >> choice;

for (int j= 0; j < 12832; j++)
{
	if (size[j].find(Size) !=std::string::npos)
	{
		cout << description[j] << industry[j] << level[j] << size[j]
		<< line_code[j] << value[j] ;
		count++;
	}
}
   cout << count ;
}

else if (choice==5)
{
	cout << "Enter line_code:";
	cin >> choice;

for (int j= 0; j < 12832; j++)
{
	if (line_code[j].find(Line_code) !=std::string::npos)
	{
		cout << description[j] << industry[j] << level[j] << size[j]
		<< line_code[j] << value[j] ;
		count++;
	}
}
   cout << count ;
}


else if (choice==6)
{
	cout << "Enter line_code:";
	cin >> choice;

for (int j= 0; j < 12832; j++)
{
	if (value[j].find(Value) !=std::string::npos)
	{
		cout << description[j] << industry[j] << level[j] << size[j]
		<< line_code[j] << value[j] ;
		count++;
	}
}
   cout << count ;
}











	}
