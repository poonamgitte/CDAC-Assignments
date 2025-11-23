#include<iostream>
#include<cstring>
using namespace std;

#include"Account.h"

//  char* id;
//         char* fname;
//         char* lname;
//         int mobileno;
//         char* email;

int Account::accountCount = 0;

Account::Account(){
    cout<<"Inside Default constructor of Account"<<endl;

    id[0] = '\0';
    fname[0] = '\0';
    lname[0] = '\0';
    mobileno = 0;
    email[0] = 0;

}
Account::Account( const char* fnm, const char* lnm, long long int mno, const char* e ){
     cout<<"Inside Parameterised constructor of Account"<<endl;

    fname = new char[strlen(fnm)+1];
    strcpy(fname,fnm);

    lname = new char[strlen(lnm)+1];
    strcpy(lname, lnm);

    mobileno = mno;

    email = new char[strlen(e)+1];
    strcpy(email, e);

    accountCount++;

    string f(fname);
    string l(lname);

    string fpart = f.substr(0,3);
    string lpart = l.substr(0,3);

    id = fpart + lpart + to_string(accountCount);
}

Account::~Account(){
    cout<<"Inside Destructor of Account"<<endl;
    if(fname)
    	delete[] fname;
    if(lname)
    	delete[] lname;
    if(email)
    	delete[] email;
}

void Account::setFname(const char* fnm){
    delete[] fname;

    fname = new char[strlen(fnm)+1];
    strcpy(fname, fnm);
}
void Account::setLname(const char* lnm){
    delete[] lname;

    lname = new char[strlen(lnm) + 1];
    strcpy(lname, lnm);
}
void Account::setMobileno(long long int mno){
    mobileno = mno;
}
void Account::setEmail(const char* e){
    delete[] email;

    email = new char[strlen(e)+1];
    strcpy(email,e);
}

void Account::display() const{
    cout<<"Account details"<<endl;

    //cout<<"Account Id : "<<id<<endl;
    cout<<"Name : "<<fname<<" "<<lname<<endl;
    cout<<"Mobile number : "<<mobileno<<endl;
    cout<<"Email Address : "<<email<<endl<<endl;
}
