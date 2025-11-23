//Program for finding whether the number is prime or not
#include<iostream>
#include<cmath>
using namespace std;

bool isPrime(int num){
	if( num <= 1){
		return 1;		
	}
	
	for(int i=2;i<=sqrt(num);i++){
		if(num%i ==0){
			return 1;
		}
	}
	
	return 0;
}

int main(){

	int num;
	cout<<"Enter number=";
	cin>>num;	
	
	if(isPrime(num)){
		cout<<num<<" is not prime number"<<endl;
	}
	else{
		cout<<num<<" is prime number"<<endl;
	}
		
	return 0;
}
