//TestPerson file to test menu driven program of object and class of person

#include<iostream>
#include"PersonService.h"

using namespace std;


	

int main(){
	
	int choice;
	
		cout<<"Menu for person"<<endl;
		
		cout<<"1. Add person"<<endl;
		cout<<"2. display all"<<endl;
		cout<<"3. Search by id"<<endl;
		cout<<"4. Search by name"<<endl;
		cout<<"5. Modify Address"<<endl;
		cout<<"6. find address by id"<<endl;
		cout<<"7.display all person stay in given city"<<endl;
		cout<<"8. exit"<<endl;
		
	
	do{
	
		
		cout<<endl<<"Enter choice:"<<endl;
		cin>>choice;
		
		switch(choice){
			case 1:
				{
					PersonService::AcceptData();
					//PersonService::AddPerson(p);
				}
				break;
				
			case 2: {
					cout<<"------------All Persons------------"<<endl;
					
					PersonService::DisplayAll();
				}
				break;
			case 3:
				{
					int id;
					cout<<"Enter id for search:"<<endl;
					cin>>id;
					
					Person *p1 = PersonService::SearchById(id );
					
					if(p1){
						p1->display();
					}
					else{
						cout<<"Id "<<id<<" not found"<<endl;
					}
				}
				break;
			
		
			case 4:
				{
					char name1[30];
					cout<<"Enter name for search:"<<endl;
					// cin>>name1;
					cin.ignore();
					cin.getline(name1,30);
					
					Person* result[100];
					int cnt;
					
					cnt = PersonService::SearchByName(name1, result);
					
					if(cnt < 0){
						
						cout<<name1<<" not found"<<endl;
						cout<<"-----------------------"<<endl;
						
					}
					else{
						cout<<"Person with name "<<name1<<endl;
						for(int i=0; i<=cnt; i++){
							result[i]->display();
							cout<<"-----------------------"<<endl;
						}
					}
				}
				break;
			
			case 5:
				{
					int id1, pin;
					char street[30], city[30], state[30];
					cout<<"Enter Id to change Address:"<<endl;
					cin>>id1;
					
					cout<<"Enter Address to modify:"<<endl;
		
					//cin>>street;
					cout<<"Street:"<<endl;
					cin.ignore();
					cin.getline(street,30);

					cout<<"city:";
					//cin>>city;
					cin.getline(city,30);

					cout<<"State:";
					//cin>>state;
					cin.getline(state,30);
	
					cout<<"Pin:";
					cin>>pin;
					
					Person *p4 = PersonService::ModifyAddr(id1,street, city, state, pin);
					
					if(p4){
						cout<<"Address modified..."<<endl;
						p4->display();
					}
					else{
						cout<<id1<<" not found"<<endl;
					}
					break;
				}

			case 6:
				{
					int id;
					cout<<"Enter id to search address"<<endl;
					cin>>id;

					Person* p = PersonService::FindAddress(id);

					if(p){
						cout<<"Address found at id "<<id<<" is :"<<endl;
						p->getAddr().display();
					}
					else{
						cout<<id<<" not found"<<endl;
					}
				}
				break;
			case 7:
				{
					char* city;
					city = new char[30];

					Person* result[100];

					cout<<"Enter city to Search Person"<<endl;
					//cin>>city;

					cin.ignore();
					cin.getline(city,30);

					int cnt = PersonService::FindByCity(city, result);

					if(cnt < 0){
						cout<<"No person stay in city "<<city<<endl;
						
					}
					else{
						cout<<"All Person stay in city "<<city<<endl;
						for(int i=0; i<=cnt; i++){
							result[i]->display();
							cout<<"-----------------------"<<endl;

						}
					}
					break;
				}
			case 8:
				cout<<"Thank you for visiting!..."<<endl;
				break;
			default:
				cout<<"enter valid choice!"<<endl;
				break;
		}
		
	}while(choice != 8);
	
	return 0;
	
}
