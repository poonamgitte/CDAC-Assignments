#include<iostream>
#include<cstring>
#include<vector>
using namespace std;

#include"SportService.h"

int main(){
    int choice;

    cout<<"Welcome to Golden Star Sports Academy"<<endl;
    do{
        cout<<"------------Academy menu------------"<<endl;
        cout<<"1.Add new Player"<<endl;
        cout<<"2.Add new Sport"<<endl;
        cout<<"3.Enroll Player into sport"<<endl;
        cout<<"4.Display all Players"<<endl;
        cout<<"5.Display all sports"<<endl;
        cout<<"6.Display all Sports enrolled by given player"<<endl;
        cout<<"7.Dispaly all player with registered sport "<<endl;
        cout<<"0.exit"<<endl;

        cout<<"Enter choice:"<<endl;
        cin>>choice;

        switch(choice){
            case 1:{
                int id, age;
                string name;
                long long int mno;

                cout<<"Enter player id:";
                cin>>id;

                cout<<"Enter name: ";
                cin.ignore();
                getline(cin, name);

                cout<<"enter age:";
                cin>>age;

                cout<<"enter mobile number:";
                cin>>mno;

                SportService::AddPlayer(id, name, age, mno);
                break;
            }
            case 2:{
                 string sname;
                 double f;

                 
                 cout<<"Enter sport name: ";
                 cin.ignore();
                 getline(cin, sname);

                 cout<<"Enter sport fees:";
                 cin>>f;

                SportService::AddSport(sname,f);

                break;
            }
            case 3:{
                int pid;
                string sname;

                cout<<"Enter person id to enroll sport"<<endl;
                cin>>pid;

                cout<<"Enter sport name"<<endl;
                cin.ignore();
                getline(cin,sname);

                SportService::EnrollPlayerIntoSport(pid,sname);
                break;
            }
            case 4:{
                
                SportService::displayAllPlayers();
                break;
            }
            case 5:{
                SportService::displayAllSports();
                break;
            }

            case 6:{
                int pid;

                cout<<"enter player id to display all enrolled sports"<<endl;
                cin>>pid;

                SportService::displayPlayerSports(pid);

                break;
            }

            case 7:{
                SportService::displayAllPlayerwithSports();
                break;
            }
        }

    }while(choice != 0);
}