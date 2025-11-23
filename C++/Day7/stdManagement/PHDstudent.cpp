#include<iostream>
#include<cstring>

using namespace std;
#include"PHDstudent.h"


string PHDstudent::degree = "PhD";
PHDstudent::PHDstudent(){
	
	//cout<<"Inside default constructor of phdstudent"<<endl;
	this->Thmark=0;
	this->ThesisName=nullptr;
	this->phdPer = 0.0;
}

PHDstudent::PHDstudent(int id, const char* nm, const char* ad, int m[3],const char* Tname, int Tmark):Student(id,nm,ad,m)
{

	//cout<<"Inside parameterised constructor of PHDstudent"<<endl;
	
	ThesisName = new char[strlen(Tname)+1];
	strcpy(ThesisName,Tname); 
	
	this->Thmark=Tmark;
}

PHDstudent::~PHDstudent(){
	if (ThesisName)
        delete[] ThesisName; 
	//cout<<"Inside Destructor of phdstudent"<<endl;
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

inline double PHDstudent::getPercent(){
	return this->phdPer;
}

//Display students
void PHDstudent::display() const{
	Student::display();
	cout<<"Thesis Name:"<<ThesisName<<endl;
	cout<<"Thesis marks:"<<Thmark<<endl;
	cout<<"Degree:"<<degree<<endl;
	cout<<"Percent:"<<phdPer<<endl;
}

//Calculate PHD student percentages
//Calculate percentage
void PHDstudent::calPercent(){
	int m1 = Student::getM1();
	int m2 = Student::getM2();
	int m3 = Student::getM3();
	phdPer = ((m1+m2+m3+Thmark)/400.0)*100;
}
	
	





