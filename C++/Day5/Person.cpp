//Person File with setter getter and display
#include<cstring>
#include<iostream>

using namespace std;

class Person{
	private:
		int id;
		char name[100];
		char addr[100];
		int age;
		
	public:
		//Default constructor
		Person(){
			//cout<<"In default constructor"<<endl;
			id = 0;
			name[0] = '\0';
			addr[0] = '\0';
			age =0;
		}
		
		//Paramaterised constructor
		Person(int id, const char* nm, const char* ad, int ag){   // When pass string directly to object in main then use const char pointer
			//cout<<"In parameterised constructor"<<endl;
			this->id = id;
			
			strncpy(name, nm, sizeof(name)-1);
			name[sizeof(name)-1] = '\0';
			
			strcpy(addr, ad);
			
			this->age =ag;
		}
		
		//Display 
		void display() const{
			cout<<"Id : "<<this->id<<endl;
			cout<<"Name : "<<this->name<<endl;
			cout<<"Address : "<<this->addr<<endl;
			cout<<"Age : "<<this->age<<endl;
		}
		void setId(int id){
			this->id=id;
			
		}
		void setName(const char* nm){
			strncpy(name, nm, sizeof(name)-1);
			name[sizeof(name)-1] = '\0';
		}
		void setAddr(const char *addr){
			strncpy(this->addr, addr, sizeof(addr)-1);
			name[sizeof(addr)-1] = '\0';
		}
		void setAge(int age){
			this->age=age;
		}
		
		int getId(){
			return this->id;
		}
		char* getName(){
			return this->name;
		}
		char* getAddr(){
			return this->addr;
		}
		int getAge(){
			return this->age;
		}
};


