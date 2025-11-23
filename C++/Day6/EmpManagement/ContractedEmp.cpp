#include "ContractedEmp.h"
#include<iostream>
using namespace std;

ContractedEmp::ContractedEmp():hrs(0),ratehr(0.0){
cout<<"in default constructor of ContractedEmp"<<endl;
  
  }

ContractedEmp::ContractedEmp(int eno,const char* nm,const char *dt,const char* ds,int h,double rate):Employee(eno,nm,dt,ds){
cout<<"in parametrised constructor of ContractedEmp"<<endl;
  hrs=h;
  ratehr=rate;
}
ContractedEmp::~ContractedEmp(){
   cout<<"in ContractedEmp destructor"<<endl;
}

void ContractedEmp::display(){
     Employee::display();
     cout<<"No Of Hours: "<<hrs<<endl;
     cout<<"Rate per hour : " <<ratehr<<endl;

}

