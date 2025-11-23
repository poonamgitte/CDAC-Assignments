#ifndef ADDRESS_H
#define ADDRESS_H

#include <iostream>
#include <string>
using namespace std;

class Address {
    string street;
    string city;
    int pin;

public:
    Address();
    Address(string st, string ct, int p);
    Address(const Address &a);   // copy constructor
    ~Address();

    void display();
};

#endif
