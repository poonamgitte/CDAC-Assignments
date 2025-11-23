#include<iostream>
#include<cstring>
using namespace std;

#include"AccountService.h"


int main(){
    // cout<<"Account:"<<endl;
    // Account a("poonam", "gitte", 8468910918, 125432456755, "poonamgitte@gmail.com", 50000.0);
    // a.display();

    // cout<<"Saving Account:"<<endl;
    // SavingAccount s("poonam", "gitte", 8468910918, 125432456755, "poonamgitte@gmail.com", 50000.0, 4544);
    // s.display();

    // cout<<"Current Account"<<endl;
    // CurrentAccount c("Pranita", "gitte", 8468910918, 125432456755, "poonamgitte@gmail.com", 50000.0, 20);
    // c.display();

    int choice;

    do{

        std::cout<<"------------Account management menu------------"<<endl;
        std::cout << "1. Add new account"<<endl;
        std::cout << "2. Display All Accounts"<<endl;
        std::cout << "3. Search by account number"<<endl;
        std::cout << "4. Search by Name"<<endl;
        std::cout << "5. Sort Accounts by balance"<<endl;
        std::cout << "6. Display All Saving Account"<<endl;
        std::cout << "7. Display All Current Account"<<endl;
        std::cout << "8. Exit"<<endl;

        cout<<"Enter choice"<<endl;
        cin>>choice;

        switch(choice){
            case 1: {
                int n;
                cout<<"Enter choice to add account"<<endl;
                cout<<"1.Saving Account"<<endl<<"2.Current Account"<<endl;
                cin>>n;

                AccountService::addAccount(n);

                cout<<"Account added.."<<endl;

                break;
            }
            case 2:{
                AccountService::displayAll();
                break;
            }
            case 3:{
                int ano;
                cout<<"Enter account number to search:"<<endl;
                cin>>ano;

                Account* a = AccountService::searchByAccountNo(ano);

                if(a){
                    cout<<"Account with account number "<<ano<<" is:"<<endl;
                    a->display();
                }
                else{
                    cout<<"Account not found"<<endl;
                }
                break;
            }
            case 4:{
                char fname[30];
                char lname[30];

                cout<<"Enter name to search:"<<endl;
                cout<<"First name: ";
                cin>>fname;
                 
                cout<<"last name: ";
                cin>>lname;
                 
                Account* result[100];
                int cnt = AccountService::searchByName(fname, lname, result);

                if(cnt < 0){
                    cout<<"Account Not found"<<endl;
                }
                else{
                    cout<<"Account with name "<<fname<<" "<<lname<<endl;
                    for(int i=0; i<=cnt;i++){
                        result[i]->display();
                        cout<<"------------------------------------"<<endl;
                    }
                }
                break;
            }
            case 5:{
                AccountService::sortByBalance();

                cout<<"Accounts after sorted by balance."<<endl;
                AccountService::displayAll();
                break;
            }
            case 6:{
                cout<<"------------All saving Accounts--------------"<<endl;
                AccountService::displaySavingAccount();
                break;
            }
            case 7:{
                cout<<"------------All current Accounts--------------"<<endl;
                AccountService::displayCurrentAccount();
                break;
            }
            case 8:{
                break;
            }
            default:{
                cout<<"Enter valid choice"<<endl;
                break;
            }
        }
    
    }while(choice != 8);

    return 0;

}