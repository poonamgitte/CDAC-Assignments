#include<iostream>
#include<cstring>

using namespace std;
#include"MSCstudent.h"


string MSCstudent::degree = "MSC";


MSCstudent::MSCstudent(){
	
	//cout<<"Inside default constructor of MSCstudent"<<endl;
	this->Smarks=0;
	this->Lmarks=0;
	this->mscPer=0.0;
}

MSCstudent::MSCstudent(int id, const char* nm, const char* ad, int m[3],int sm,int lm):Student(id,nm,ad,m){

	//cout<<"Inside parameterised constructor of MSCstudent"<<endl;
	this->Smarks=sm;
	this->Lmarks=lm;
}
MSCstudent::~MSCstudent(){
	
	//cout<<"Inside Destructor of MSCstudent"<<endl;
}

//Setter methods
inline void MSCstudent::setSmarks(int sm){
	this->Smarks=sm;
	
}
inline void MSCstudent::setLmarks(int lm){
	this->Lmarks=lm;
}

//Getter methods
inline int MSCstudent::getSmarks(){
	return Smarks;
}
inline int MSCstudent::getLmarks(){
	return Lmarks;
}	

inline double MSCstudent::getPercent(){
	return this->mscPer;
}

//Display method
void MSCstudent::display() const{
	Student::display();
	cout<<"Special subject marks:"<<Smarks<<endl;
	cout<<"Language marks:"<<Lmarks<<endl;
	cout<<"Degree:"<<degree<<endl;
	cout<<"Percent:"<<mscPer<<endl;
}

//Calculate percentage
void MSCstudent::calPercent(){
	int m1 = Student::getM1();
	int m2 = Student::getM2();
	int m3 = Student::getM3();
	mscPer = ((m1+m2+m3+Lmarks+Smarks)/500.0)*100;
}
	






