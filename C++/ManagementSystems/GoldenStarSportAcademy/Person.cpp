#include<iostream>
#include<cstring>
using namespace std;

#include"Person.h"

//Constructors
Person::Person(): name(""), age(0){}

Person::Person(string nm, int a){
    name = nm;
    age = a;
}

//Destructor
Person::~Person(){}

//Setter 
void Person::setName(string n){
    name = n;
}

void Person::setAge(int a){
    age = a;
}

//Getter
string Person::getName(){
    return name;
}
int Person::getAge(){
    return age;
}

//Display
void Person::display(){
    cout<<"Name:"<<name<<endl;
    cout<<"Age:"<<age<<endl;
}