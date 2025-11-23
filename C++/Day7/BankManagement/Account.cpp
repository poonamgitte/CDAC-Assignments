#include<iostream>
#include<cstring>
using namespace std;

#include"Account.h"

int Account::accountCount = 0;

Account::Account(){
    id = nullptr;
    fname = nullptr;
    lname = nullptr;
    mobileno = 0;
    AccountNo = 0;
    email = nullptr;
    balance = 0.0;
}
Account::Account(const char* fnm, const char* lnm, long long int mno, long long int ano, const char* e, double b ){
    fname = new char[strlen(fnm)+1];
    strcpy(fname, fnm);

    lname = new char[strlen(lnm)+1];
    strcpy(lname, lnm);

    mobileno = mno;
    AccountNo = ano;

    email = new char[strlen(e)+1];
    strcpy(email, e);

    balance = b;
    accountCount++;

    string f(fname);
    string l(lname);

    string fpart = f.substr(0,3);
    string lpart = l.substr(0,3);

    id = fpart + lpart + to_string(accountCount);
}

Account::~Account(){
    if(fname)
        delete[] fname;
    if(lname)
        delete[] lname;
    if(email)
        delete[] email;
}

//setter methods
void Account::setFname(const char* fname){
    delete[] fname;

    fname = new char[strlen(fname)+1];
    strcpy(this->fname, fname);
}

void Account::setLname(const char* lname){
    delete[] lname;

    lname = new char[strlen(lname)+1];
    strcpy(this->lname, lname);
}
void Account::setMobileno(long long int mno){
    this->mobileno= mno;
}
void Account::setAccountno(long long int ano){
    AccountNo = ano;
}
void Account::setBalance(double b){
    balance = b;
}

//Getter methods
const char* Account::getFname(){
    return fname;
}

const char* Account::getLname(){
    return lname;
}

long long int Account::getMobileno(){
    return mobileno;
}
long long int Account::getAccountno(){
    return AccountNo;
}

double Account::getBalance(){
    return balance;
}

//Display method
void Account::display(){
    cout<<"Name: "<<fname<<" "<<lname<<endl;
    cout<<"Mobile no: "<<mobileno<<endl;
    cout<<"Email: "<<email<<endl;
    cout<<"Account number: "<<AccountNo<<endl;
    cout<<"Account Balance: "<<balance<<endl;

}
