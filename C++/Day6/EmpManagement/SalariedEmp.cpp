#include "SalariedEmp.h"
#include<iostream>
using namespace std;

SalariedEmp::SalariedEmp():sal(0.0),bonus(0.0){
cout<<"in default constructor of SalariedEmp"<<endl;
  //sal=0.0
  //bonus=0.0;
}

SalariedEmp::SalariedEmp(int eno,const char* nm,const char *dt,const char* ds,double s):Employee(eno,nm,dt,ds){
cout<<"in parametrised constructor of SalariedEmp"<<endl;
  sal=s;
  bonus=s*0.10;
}
SalariedEmp::~SalariedEmp(){
   cout<<"in salariedemp destructor"<<endl;
}

void SalariedEmp::display(){
     Employee::display();
     cout<<"Salary: "<<sal<<endl;
     cout<<"bonus: " <<bonus<<endl;

}

