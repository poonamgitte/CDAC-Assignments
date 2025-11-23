#include<iostream>
#include<cstring>
using namespace std;
#include"Student.h"

int Student::passPer = 35;

Student::Student(){
	cout<<"Inside default constructor of student"<<endl;
	this->id = 0;
	this->name[0]='\0';
	this->addr[0] = '\0';
	
	for(int i=0; i<3; i++){
		this->marks[i] = 0;
	}
	
};

Student::Student(int id, const char* nm, const char* ad, int m[3]){
	cout<<"Inside parameterised constructor of student"<<endl;
	this->id = id;
	
	name = new char[strlen(nm)+1];
	strcpy(name,nm); 
	
	addr = new char[strlen(ad)+1];
	strcpy(addr,ad); 
	
	for(int i=0; i<3; i++){
		this->marks[i] = m[i];
	
	}
}
Student::~Student(){
	if(name)
		delete[] name;
	if(addr)
		delete[] addr;
		
	cout<<"Inside destructor of student"<<endl;
	
}

//Setter methods
inline void Student::setId(int id){
	this->id = id;
}
inline void Student::setname(const char* nm){
	delete[] name;
	name = new char[strlen(nm)+1];
	strcpy(name, nm);
}
inline void Student::setAddr(const char* ad){
 	delete[] addr;
	addr = new char[strlen(ad)+1];
	strcpy(addr, ad);
}
//void setmarks(int marks[]);

//Getter methods
inline int Student::getId(){
	return this->id;
}

inline const char* Student::getName(){
	return this->name;
}

inline const char* Student::getAddr(){
	return this->addr;
}

void Student::display() const{
	cout<<"-----Student Details-----"<<endl;
	cout<<"Id : "<<id<<endl;
	cout<<"Name : "<<(name?name:"not available")<<endl;
	cout<<"Address : "<<(addr?addr:"not available")<<endl;
	cout<<"Passing Percentage"<<passPer<<endl;
	
	for(int i=0; i<3; i++){
		cout<<"Mark"<<i+1<<" : "<<marks[i]<<endl;
	}
}
