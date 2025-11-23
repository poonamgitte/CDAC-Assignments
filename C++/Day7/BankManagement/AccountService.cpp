#include<iostream>
#include<cstring>
using namespace std;

#include"AccountService.h"

Account* AccountService::arr[100];
int AccountService::count = 0;

void AccountService::addAccount(int n){
    char* fname;
    char* lname;
    long long int mno;
    long long int ano;
    char* email;
    double bal;

    fname = new char[30];

    cout<<"Enter data to add person: "<<endl;
    cout<<"Enter first name: "<<endl;
    cin>>fname;

    lname = new char[30];

    cout<<"Enter last name: "<<endl;
    cin>>lname;

    cout<<"Enter mobile number: "<<endl;
    cin>>mno;

    cout<<"Enter Account number "<<endl;
    cin>>ano;

    email = new char[30];

    cout<<"Enter Email: "<<endl;
    cin>>email;

    cout<<"Enter balance: "<<endl;
    cin>>bal;

    //Taking input for Saving Account
    if(n == 1){
        long int cno;

        cout<<"Enter Check book number:"<<endl;
        cin>>cno;

        arr[count++] = new SavingAccount(fname, lname, mno, ano, email, bal, cno);
    }
    else if(n == 2){
        int tno;
        cout<<"Enter transactions per day: "<<endl;
        cin>>tno;

        arr[count++] = new CurrentAccount(fname, lname, mno, ano, email, bal, tno);
    }
    else{
        cout<<"Invaid choice."<<endl;
    }
}

void AccountService::displayAll(){
    cout<<"------------All Accounts--------------"<<endl;

    for(int i=0; i<count; i++){
        cout<<"Account "<<i+1<<endl;
        arr[i]->display();
        cout<<"------------------------------------"<<endl;
    }
}

Account* AccountService::searchByAccountNo(int ano){

    for(int i = 0; i<count; i++){

        if(arr[i]->getAccountno() == ano){
            return arr[i];
        }
    }
    return nullptr;
}


int AccountService::searchByName(const char* fname, const char* lname, Account* result[100]){

    int cnt = -1;
    for(int i=0; i<count; i++){

        if(((strcasecmp(arr[i]->getFname(), fname)) == 0) && ((strcasecmp(arr[i]->getLname(), lname)) == 0)){
            result[++cnt] = arr[i];
        }
    }
    return cnt;
}

void AccountService::sortByBalance(){

    for(int i = 0; i<count-1; i++){
        int minindex = i;
        for(int j=i+1; j<count;j++){

            if(arr[j]->getBalance() < arr[minindex]->getBalance()){
                minindex = j;
            }
        } 

        Account* temp = arr[i];
        arr[i] = arr[minindex];
        arr[minindex] = temp;
    }
}

void AccountService::displaySavingAccount(){

    for(int i=0; i<count; i++){
        if(dynamic_cast<SavingAccount*>(arr[i])){
            arr[i]->display();
            cout<<"------------------------------------"<<endl;
        }
    }
}
    
void AccountService::displayCurrentAccount(){

    for(int i=0; i<count; i++){
        if(dynamic_cast<CurrentAccount*>(arr[i])){
            arr[i]->display();
            cout<<"------------------------------------"<<endl;
        }
    }
}
