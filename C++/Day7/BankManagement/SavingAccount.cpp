#include<iostream>
#include<cstring>
using namespace std;

#include"SavingAccount.h"

int SavingAccount::interestRate  = 4;
int SavingAccount::minBalance = 20000;

SavingAccount::SavingAccount(){
    checkBookno = 0;
}
SavingAccount::SavingAccount(const char* fnm, const char* lnm, long long int mno, long long int ano, const char* e, double b, long int cno) : Account(fnm, lnm, mno, ano, e, b){
    checkBookno = cno;
}

SavingAccount::~SavingAccount(){}

//Setter methods
void SavingAccount::setCheckBookNo(long int cno){
    checkBookno = cno;
}

//Getter methods
long int SavingAccount::getCheckBookNo(){
    return checkBookno;
}

int SavingAccount::getInterestRate(){
    return interestRate;
}

int SavingAccount::getMinBalance(){
    return minBalance;
}

//display function
void SavingAccount::display(){
    Account::display();
    cout<<"Check book number: "<<checkBookno<<endl;
    cout<<"Interest rate : "<<interestRate<<endl;
    cout<<"minimum balance: "<<minBalance<<endl;
}