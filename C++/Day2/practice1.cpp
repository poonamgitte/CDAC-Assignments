#include<iostream>
using namespace std;

int main(){
	int choice;
	do{
		cout<<"Enter choice:"<<endl;
		cout<<"1.find max"<<endl;
		cout<<"2.find max of 3"<<endl;
		cout<<"3.Find isPrime"<<endl;
		cout<<"4.Table"<<endl;
		cout<<"5.Factorial"<<endl;
		cout<<"6.swap no"<<endl;
		cout<<"7.exit"<<endl;
		
		switch(choice){
			case 1:
				int n1,n2;
				cout<<"Enter two numbers :";
				cin>>n1>>n2;
				Maxnum(n1,n2);
				break;
			case 2:
				int n1,n2,n3;
				cout<<"Enter three numbers :";
				cin>>n1>>n2>>n3;
				Maxnum(n1,n2,n3);
				break;
			case 3:
				int num;
				cout<<"Enter number:";
				cin>>num;
				isPrime(num);
				break;
			case 4:
				int num;
				cout<<"Enter number:";
				cin>>num;
				printTable(num);
				break;
			case 5:
				int num;
				cout<<"Enter number:";
				cin>>num;
				factorial(num);
				break;
			case 6:
				int n1,n2;
				cout<<"Enter Two number:";
				cin>>n1>>n2;
				swap(num);
				break;
				
		}
		
		
		
		
	}
}
