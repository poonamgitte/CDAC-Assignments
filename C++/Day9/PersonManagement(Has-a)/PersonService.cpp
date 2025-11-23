///Person Serives File for Menu driven program of person

#include<iostream>
#include<cstring>
//#include"Person.h"
#include"PersonService.h"
using namespace std;

//Using getline 
//1 for character array
// cin.getline(name, 20)   size necessary
//2. for string
// getline(cin,name)


Person* PersonService:: parr[100];
int PersonService:: count=0;

// Accept data
void PersonService::AcceptData(){
	 
	 int  pin;
	 char name[30];
	 char street[30];
	 char city[30];
	 char state[30];

	
	cout<<"Enter Name of the person:"<<endl;
	//cin>>name;
	cin.ignore();
	cin.getline(name,30);
	
	cout<<"Enter Address of the person:"<<endl;
	cout<<"street: ";
	//cin.ignore();
	cin.getline(street,30);
	
	cout<<"city:";
	//cin.ignore();
	cin.getline(city,30);

	cout<<"State:";
	//cin.ignore();
	cin.getline(state,30);
	
	cout<<"Pin:";
	cin>>pin;
	
	parr[count++] = new Person(name, street ,city,state, pin);
}

//Add person in array
/*void PersonService::AddPerson(Person &p1){

	if(count < 100){
		parr[count] = p1;
		cout<<"Person added at "<<count<<" Position"<<endl;
		count++;
	}
	else{
		cout<<"List is full";
	}
}*/


//Display All person

void PersonService::DisplayAll(){
	for(int i =0; i<count;i++){
		cout<<"Person: "<<i+1<<endl;
		parr[i]->display();
		cout<<"--------------------"<<endl;
	}
}

//Search person by id
Person* PersonService::SearchById(int id ){
	
	for(int i=0; i<count;i++){
		if(parr[i]->getId() == id){
			return parr[i];
		}
	}
	return nullptr;
}

//Search By name

int PersonService::SearchByName(char* name, Person* result[100]){
	int cnt = -1;
	for(int i=0; i<count;i++){
		if((strcasecmp(parr[i]->getName(), name)) == 0){
			result[++cnt] = parr[i];
		}
	}
	return cnt;
}


//Modify Adress By id
Person* PersonService::ModifyAddr(int id, char* street, char* city, char* state, int pin){
	
	
	for(int i=0; i<count;i++){
	
		if(parr[i]->getId() == id){
			parr[i]->getAddr().setStreet(street);
			parr[i]->getAddr().setCity(city);
			parr[i]->getAddr().setState(state);
			parr[i]->getAddr().setPin(pin);
		
			return parr[i];
		}

		// or
		// Address& a = parr[i]->getAddr();
		// if(parr[i]->getId() == id){
		// 	a.setStreet(street);
		// 	a.setCity(city);
		//  a.setState(state);
		// 	a.setPin(pin);
		
		// 	return parr[i];
		// }
	}
	return nullptr;
	
}


//Find address by id

Person* PersonService::FindAddress(int id){
	int cnt =-1;
	for(int i=0; i<count; i++){
		if(parr[i]->getId() == id){
			return parr[i];
		}
	}
	return nullptr;
}

//Find person by City

int PersonService::FindByCity(char* city, Person* result[100]){

	int cnt = -1;

	for(int i=0; i<count;i++){

		int checkCity = strcasecmp(parr[i]->getAddr().getCity(), city);
		if(checkCity == 0){
			result[++cnt] = parr[i];
		}
	}
	return cnt;
}

		
