///Person Serives File for Menu driven program of person

#include<iostream>
#include<cstring>
#include"Person.cpp"
using namespace std;

class PersonServices{

	private:
		static Person parr[100];	
		static int count;
		
	public:
		// Accept data
		static Person AcceptData(){
			 
			 int id, age;
			 char name[100],addr[100];
			cout<<"Enter Person Id:"<<endl;
			cin>>id;
			cout<<"Enter Name of the person:"<<endl;
			cin>>name;
			cout<<"Enter Address of the person:"<<endl;
			cin>>addr;
			cout<<"Enter Age of Person:"<<endl;
			cin>>age;
			
			return Person(id, name, addr, age);
			
		}
		
		//Add person in array
		static void AddPerson(Person &p1){
		
			if(count < 100){
				parr[count] = p1;
				cout<<"Person added at "<<count<<" Position"<<endl;
				count++;
			}
			else{
				cout<<"List is full";
			}
		}
		
		//Search person by id
		static Person* SearchById(int id ){
			
			for(int i=0; i<count;i++){
				if(parr[i].getId() == id){
					return &parr[i];
				}
			}
			return nullptr;
		}
		
		//Display All person
		static void DisplayAll(){
			for(int i =0; i<count;i++){
				cout<<"Person "<<i+1<<endl;
				parr[i].display();
			}
		}
		
		//Search By name
		static Person* SearchByName(char name[]){
			
			for(int i=0; i<count;i++){
				if(!(strcmp(parr[i].getName(), name))){
					return &parr[i];
				}
			}
			return nullptr;
		}
		//Sort person by id
		static void SortById(){
			for(int i=0; i<count-1;i++){
				
				int minindex=i;
				
				for(int j=i+1;j<count;j++){
					
					if(parr[j].getId() < parr[minindex].getId()){
						minindex = j;
					}
				}
	
				if(minindex != i){
					Person temp = parr[i];
					parr[i] = parr[minindex];
					parr[minindex] = temp;
				}
				
			}
		}
		
		//Sort Person By Name
		static void SortByName(){
			for(int i=0; i<count-1;i++){
				
				int minindex=i;
				
				for(int j=i+1;j<count;j++){
					int result=(strcasecmp(parr[j].getName(),parr[minindex].getName()));
					if(result<0){
						minindex = j;
					}
				}
				
				if(minindex != i){
					Person temp = parr[i];
					parr[i] = parr[minindex];
					parr[minindex] = temp;
				}
				
			}
		}
		
		
		//Modify by Adress By id
		static Person* ModifyAddr(int id, char ad[]){
			
			
			for(int i=0; i<count;i++){
				if(parr[i].getId() == id){
					parr[i].setAddr(ad);
					return &parr[i];
				}
			}
			return nullptr;
			
		}
		
		
		
};
