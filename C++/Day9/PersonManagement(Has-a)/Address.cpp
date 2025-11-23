#include<iostream>
#include<cstring>
using namespace std;

#include"Address.h"

Address::Address(){
	street = nullptr;
	city = nullptr;
	state = nullptr;
	pin = 0;
}

Address::Address(char* street, char* city, char* state, int pin){
	this->street = new char[strlen(street)+1];
	strcpy(this->street,street); 
	
	this->city = new char[strlen(city)+1];
	strcpy(this->city,city); 
	
	this->state = new char[strlen(state)+1];
	strcpy(this->state,state); 	
	
	this->pin = pin;
}

Address::~Address(){
	if(street)
		delete[] street;
	if(city)
		delete[] city;
	if(state)
		delete[] state;
}

//Setters
void Address::setStreet(char* st){
	delete[] street;
	this->street = new char[strlen(st)+1];
	strcpy(this->street,st); 
	
}
void Address::setCity(char* c){
	delete[] city;
	this->city = new char[strlen(c)+1];
	strcpy(this->city,c);
	}
void Address::setState(char* s){
	delete[] state;
	this->state = new char[strlen(s)+1];
	strcpy(this->state,s);
}
void Address::setPin(int pin){
	this->pin = pin;
}

// Getter methods
char* Address::getStreet(){
	return street;
}
char* Address::getCity(){
	return city;
}
char* Address::getState(){
	return state;
}
int Address::getPin(){
	return pin;
}

void Address::display(){
	cout<<"Street:"<<street<<endl;
	cout<<"City:"<<city<<endl;
	cout<<"State:"<<state<<endl;
	cout<<"Pin:"<<pin<<endl;
}
