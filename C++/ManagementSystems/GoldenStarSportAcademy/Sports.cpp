#include<iostream>
#include<cstring>
using namespace std;

#include"Sports.h"

 Sports::Sports():sname(""), fees(0.0){}

 Sports::Sports(string snm, double f){
    sname = snm;
    fees = f;
 }
 Sports::~Sports(){}

//Setter methods
void  Sports::setSname(string snm){
    sname = snm;
}
void  Sports::setFees(double f){
    fees = f;
}

//Getter methods
string  Sports::getSname(){
    return sname;
}
double Sports::getFees(){
    return fees;
}

//Display
void  Sports::displaySport(){
    cout<<"Sports name: "<<sname<<endl;
    cout<<"Sports fees: "<<fees<<endl;
}