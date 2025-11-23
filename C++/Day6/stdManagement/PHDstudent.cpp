#include<iostream>
#include<cstring>

using namespace std;
#include"PHDstudent.h"


string PHDstudent::degree = "PhD";
PHDstudent::PHDstudent(){
	
	cout<<"Inside default constructor of MSCstudent"<<endl;
	this->Thmark=0;
	this->ThesisName=nullptr;
}

PHDstudent::PHDstudent(int id, const char* nm, const char* ad, int m[3],const char* Tname, int Tmark):Student(id,nm,ad,m)
{

	cout<<"Inside parameterised constructor of MSCstudent"<<endl;
	
	ThesisName = new char[strlen(Tname)+1];
	strcpy(ThesisName,Tname); 
	
	this->Thmark=Tmark;
}

PHDstudent::~PHDstudent(){
	if (ThesisName)
        delete[] ThesisName; 
	cout<<"Inside Destructor of MSCstudent"<<endl;
}

//Setter methods
inline void PHDstudent::setThmarks(int Tmark){
	this->Thmark=Tmark;
	
}
inline void PHDstudent::setThName(const char* Tname){
	if(ThesisName)
		delete[] ThesisName;
	ThesisName = new char[strlen(Tname)+1];
	strcpy(ThesisName,Tname);
}

//Getter methods
inline const char* PHDstudent::getThName(){
	return this->ThesisName;
}

inline int PHDstudent::getThmarks(){
	return this->Thmark;
}	
void PHDstudent::display() const{
	Student::display();
	cout<<"Degree:"<<degree<<endl;
	cout<<"Marks of Thesis Name:"<<ThesisName<<endl;
	cout<<"Marks of Thesis:"<<Thmark<<endl;
	
}
	





