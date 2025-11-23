//TestPerson file to test menu driven program of object and class of person

#include<iostream>
#include"PersonServices.cpp"
using namespace std;

Person PersonServices:: parr[100];
int PersonServices:: count=0;
	

int main(){
	
	int choice;
	
		cout<<"Menu for person"<<endl;
		
		cout<<"1. Add person"<<endl;
		cout<<"2. Search by id"<<endl;
		cout<<"3. display all"<<endl;
		cout<<"4. Search by name"<<endl;
		cout<<"5. sort by id"<<endl;
		cout<<"6. sort by name"<<endl;
		cout<<"7. modify address by id"<<endl;
		cout<<"8. exit"<<endl;
		
	
	do{
	
		
		cout<<endl<<"Enter choice:"<<endl;
		cin>>choice;
		
		switch(choice){
			case 1:
				{
					Person p = PersonServices::AcceptData();
					PersonServices::AddPerson(p);
					p.display();
				}
				break;
			case 2:
				{
					int id;
					cout<<"Enter id for search:"<<endl;
					cin>>id;
					
					Person *p1 = PersonServices::SearchById(id );
					
					if(p1){
						p1->display();
					}
					else{
						cout<<id<<" not found"<<endl;
					}
				}
				break;
			case 3: {
					cout<<"All Persons :"<<endl;
					
					PersonServices::DisplayAll();
				}
				break;
				
			case 4:
				{
					char name1[100];
					cout<<"Enter name for search:"<<endl;
					cin>>name1;
					
					Person *p2 = PersonServices::SearchByName(name1);
					
					if(p2){
						p2->display();
					}
					else{
						cout<<name1<<" not found"<<endl;
					}
				}
				break;
			case 5:
				{
					
					cout<<"All Persons before sort By Id :"<<endl;
					PersonServices::DisplayAll();
					
					PersonServices::SortById();
					
					cout<<"All Persons After sort By Id :"<<endl;
					PersonServices::DisplayAll();
					
				}
				break;
			case 6:
				{
					
					cout<<"All Persons before sort By Name  :"<<endl;
					PersonServices::DisplayAll();
					
					PersonServices::SortByName();
					
					cout<<"All Persons After sort By Name:"<<endl;
					PersonServices::DisplayAll();
					
				}
				break;
			
			case 7:
				{
					int id1;
					char add[100];
					cout<<"Enter Id to change Address:"<<endl;
					cin>>id1;
					
					cout<<"Enter Address :"<<endl;
					cin>>add;
					
					Person *p4 = PersonServices::ModifyAddr(id1,add);
					
					if(p4){
						p4->display();
					}
					else{
						cout<<id1<<" not found"<<endl;
					}
				}
				break;
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
