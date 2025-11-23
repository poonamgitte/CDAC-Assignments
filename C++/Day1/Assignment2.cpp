//Program to print Table of a number
#include<iostream>
using namespace std;

void printTable(int N){
	
	for(int i=1;i<=10;i++){
		cout<<N<<" * "<<i<<" = "<<N*i<<endl;
	}
}
int main(){
	int num;
	cout<<"Enter number to print table=";
	cin>>num;
	printTable(num);
	return 0;
}
