#include "Person.h"
#include <iostream>
using namespace std;

Person::Person() : id(0), name(""), address() {}

Person::Person(int i, string n, Address addr)  {
    id = i;
    name = n;
    address = addr;
}

Person::Person(const Person &p) : id(p.id), name(p.name), address(p.address) {}

Person::~Person() {}

void Person::display() {
    cout << "ID: " << id << ", Name: " << name << endl;
    cout << "Address: ";
    address.display();
}
