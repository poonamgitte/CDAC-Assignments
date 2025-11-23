#include<iostream>
#include<cstring>

using namespace std;
#include"MSCstudent.h"


string MSCstudent::degree = "MSC";


MSCstudent::MSCstudent(){
	
	cout<<"Inside default constructor of MSCstudent"<<endl;
	this->Smarks=0;
	this->Lmarks=0;
}

MSCstudent::MSCstudent(int id, const char* nm, const char* ad, int m[3],int sm,int lm):Student(id,nm,ad,m){

	cout<<"Inside parameterised constructor of MSCstudent"<<endl;
	this->Smarks=sm;
	this->Lmarks=lm;
}
MSCstudent::~MSCstudent(){
	
	cout<<"Inside Destructor of MSCstudent"<<endl;
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
void MSCstudent::display() const{
	Student::display();
	cout<<"Degree:"<<degree<<endl;
	cout<<"Marks of special subject:"<<Smarks<<endl;
	cout<<"Language marks:"<<Lmarks<<endl;
	
}
	





