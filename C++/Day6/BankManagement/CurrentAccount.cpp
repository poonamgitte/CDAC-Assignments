#include<iostream>
#include<cstring>
using namespace std;

#include"Account.h"
#include"CurrentAccount.h"

// static int interestRate;
//         static int minBalance;
//         int transPerDay;

//     public:

int CurrentAccount::interestRate = 1;
int CurrentAccount::minBalance = 1000;

CurrentAccount::CurrentAccount(){
     cout<<"Inside Default constructor of Current Account"<<endl;
    transPerDay = 0;
}

CurrentAccount::CurrentAccount(const char* fnm, const char* lnm, long long int mno, const char* e , int TPD) : Account(fnm, lnm, mno, e) {
     cout<<"Inside Parameterised constructor of Current Account"<<endl;

     transPerDay = TPD;
}

CurrentAccount::~CurrentAccount(){
     cout<<"Inside Destructor of Current Account"<<endl;
}

//Setter methods
void CurrentAccount::setTransPerDay(int TPD){
    transPerDay = TPD;
}

//Getter methods
/*int CurrentAccount::getInterestRate(){
    return this->interestRate;
}

int CurrentAccount::getMinBalance(){
    return this->minBalance;
}*/
int CurrentAccount::getTrancPerDay(){
    return this->transPerDay;
}

void CurrentAccount::display() const{
    cout<<"Current Account"<<endl;

    Account::display();

    cout<<"Rate of interest : "<<interestRate<<"%"<<endl;
    cout<<"Minimum balance : "<<minBalance<<endl;
    cout<<"Transactions per day : "<<transPerDay<<endl;
}
