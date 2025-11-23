#include<iostream>
#include<cstring>
using namespace std;

#include"Person.h"

Person::Person():name(""){};

Person::Person(string n){
    name = n;
}
Person::~Person(){};

//Setter methods
void Person::setName(string n){
    name = n;
}

//Getter methods
string Person::getName(){
    return name;
}

void Person::display(){
    cout<<"Name: "<<name<<endl;
}