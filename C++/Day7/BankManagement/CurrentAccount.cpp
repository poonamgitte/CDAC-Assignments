#include<iostream>
#include<cstring>
using namespace std;

#include"CurrentAccount.h"

int CurrentAccount::interestRate = 1;
int CurrentAccount::minBalance = 1000;

CurrentAccount::CurrentAccount(){
    nooftrans = 0;
}

CurrentAccount::CurrentAccount(const char* fnm, const char* lnm, long long int mno, long long int ano, const char* e, double b , int tno) : Account(fnm, lnm, mno, ano, e, b){
    nooftrans = tno;
}

CurrentAccount::~CurrentAccount(){}

//Setter methods
void CurrentAccount::setNoofTrans(int tno){
    nooftrans = tno;
}

//Getter methods
int CurrentAccount::getNoofTrans(){
    return nooftrans;
}
int CurrentAccount::getInterestRate(){
    return interestRate;
}
int CurrentAccount::getMinBaqlance(){
    return minBalance;
}

//display
void CurrentAccount::display(){
    Account::display();

     cout<<"Transaction per day: "<<nooftrans<<endl;
    cout<<"Interest rate : "<<interestRate<<endl;
    cout<<"minimum balance: "<<minBalance<<endl;
}