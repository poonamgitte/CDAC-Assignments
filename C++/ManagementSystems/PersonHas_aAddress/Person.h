#ifndef PERSON_H
#define PERSON_H

#include "Address.h"

class Person {
    int id;
    string name;
    Address address;   // HAS-A relationship

public:
    Person();
    Person(int i, string n, Address addr);
    Person(const Person &p);   // copy constructor
    ~Person();

    void display();
};

#endif
