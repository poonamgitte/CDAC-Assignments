#include<iostream>
#include<cstring>
#include"SavingAccount.h"

using namespace std;

	int SavingAccount::interestRate = 4;
	int SavingAccount::minBalance = 20000;
	
	SavingAccount::SavingAccount(){
		checkBookNo=0;
	}
        SavingAccount::SavingAccount(const char* fnm, const char* lnm, long long int mno, const char* e , int CBno):Account(fnm,lnm,mno,e){
        	checkBookNo=CBno;
        	
        }
        SavingAccount::~SavingAccount(){}

        //Setter methods
        void SavingAccount::setCheckBookNo(int CBno){
		checkBookNo=CBno;        
        }

        //Getter methods
       
        int SavingAccount::getCheckBookNo(){ return checkBookNo; }

        void SavingAccount::display() const{
        
        	cout<<"Saving Account : "<<endl;
        	
        	Account::display();
        	cout<<"Checkbookno:"<<checkBookNo<<endl;
        }
