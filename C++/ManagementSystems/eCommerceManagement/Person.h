#ifndef Person_h
#define Person_h
#include<iostream>
#include<cstring>
using namespace std;

class Person{
    protected:
    string name;

    public:
    Person();
    Person(string n);
    virtual ~Person();

    //Setter methods
    void setName(string n);

    //Getter methods
    string getName();

    virtual void display();
};

#endif