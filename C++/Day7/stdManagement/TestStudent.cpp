#include<iostream>
#include<cstring>
using namespace std;

//#include"Student.h"
//#include"MSCstudent.h"
//#include"PHDstudent.h"
#include"StudentServices.h"

 	/*std::cout << "1. Add new Student";
        std::cout << "3. Display All Student\n";
        std::cout << "4. Search by Id\n";
        std::cout << "5. Search by Name\n";
        std::cout << "6. Sort Students by m1 marks\n";
        std::cout << "7. Display All MSC Student\n";
        std::cout << "8. Display All PHD Student\n";
        std::cout << "9. Exit\n";*/



int main(){
	
	
	int choice;
	do{
	cout<<"-------Menu for Student-------"<<endl;
	cout<<"1.Add new student"<<endl;
	cout<<"2.Display All Students"<<endl;
	cout<<"3.Display PhD Students"<<endl;
	cout<<"4.Display MSC Student"<<endl;
	cout<<"5. Search by Id"<<endl;
    cout<<"6. Search by Name"<<endl;
    cout<<"7. Sort Students by m1 marks"<<endl;
	cout<<"8.Display percentage list of students"<<endl;
	cout<<"9.Exit"<<endl;

	
					
		cout << "Enter your choice: ";
		cin >> choice;

		switch (choice) {
		case 1:
			{
				int c;
				cout<<"Enter choice to accept data"<<endl;
				cout<<" 1. MSC student"<<endl;
				cout<<" 2. PHD student"<<endl;
				cin>>c;
				
				StudentService::AcceptData(c);
				
				break;
			}
		case 2:{
				StudentService::displayAll();
				break;
		      } 
		      
		case 3:
			{
				
				StudentService::displayPHD();
				break;
			}
		case 4:
			{
				StudentService::displayMSC();
				break;	
			}
		case 5:{
			
				int id;
				cout<<"Enter Id to search Student:"<<endl;
				cin>>id;
				Student* s1 ;
				s1 = StudentService::searchById(id);
				if(s1)
				    s1->display();
				else
					cout<<"Student with Id "<<id<<" not found "<<endl;
				break;
		      }

		case 6:{
			
				char name[20];
				Student* result[100];
				cout<<"Enter name to search Student:"<<endl;
				cin>>name;
				int cnt;
				cnt = StudentService::searchByName(name, result);
				
				if(cnt<0){
					cout<<"No student found with name "<<name<<endl;
				}
				else{
					for(int i=0; i<=cnt; i++){
						result[i]->display();
					}
				}
				break;
		      }

		case 7:{
				StudentService::sortByM1();
				break;
		}
		case 8:
			{
				StudentService::percentList();
				break;
			}
		case 9:{
				break;
		}
		
		default:
		    std::cout << "Invalid choice.\n";
		}
	
	} while (choice != 9);

    return 0;
}




	

	
	


