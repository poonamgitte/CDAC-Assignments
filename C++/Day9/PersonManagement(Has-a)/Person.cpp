#include<iostream>
#include<cstring>
using namespace std;

#include"Person.h"


int Person::cnt=0;
Person::Person(){
	name=nullptr;
	id=0;
	
}
Person::Person(char* name,char* st,char* c,char* s,int p):addr(st,c,s,p){
	this->name = new char[strlen(name)+1];
	strcpy(this->name,name);
	
	this->id=++cnt;
}


Person::~Person(){
	if(name)
		delete[] name;
}

//Setters
//void Person::setId(int id){
//	this->id=id;
//}
void Person::setName(char* nm){
	delete[] name;
	
	this->name = new char[strlen(nm)+1];
	strcpy(this->name,nm);
	
}


// Getter methods
char* Person::getName(){
	return name;
}
int Person::getId(){
	return id;
}

Address& Person::getAddr(){
    return addr;
}


void Person::display(){
	cout<<"Id: "<<id<<endl;
	cout<<"Name: "<<name<<endl;
	addr.display();
	
}


