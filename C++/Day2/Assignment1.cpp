//Program to count number of notes required
#include<iostream>
using namespace std;

int main(){
	int Price,cnt;
	
	cout<<"Enter Price=";
	cin>>Price;
	
	cnt = Price/2000; 
	Price %= 2000;
	cout<<"2000 - "<<cnt<<" note"<<endl;
	
	cnt = Price/500;  
	Price %= 500;
	cout<<"500 - "<<cnt<<" note"<<endl;
	
	cnt = Price/100;  
	Price %= 100;
	cout<<"100 - "<<cnt<<" note"<<endl;
	
	cnt = Price/50;  
	Price %= 50;
	cout<<"50 - "<<cnt<<" note"<<endl;
	
	cnt = Price/10;  
	Price %= 10;
	cout<<"10 - "<<cnt<<" note"<<endl;
	
	cnt = Price/5;  
	Price %= 5;
	cout<<"5 - "<<cnt<<" note"<<endl;
	
	cnt = Price/2;  
	Price %= 2;
	cout<<"2 - "<<cnt<<" coin"<<endl;
	
	cnt = Price/1;  
	Price %= 1;
	cout<<"1 - "<<cnt<<" coin"<<endl;
	
	
	return 0;
	
}
