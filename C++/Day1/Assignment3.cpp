//Program to print size of variables in bytes

#include<iostream>
using namespace std;

int main(){
	cout<<"Size of char(in bytes) = "<<sizeof(char)<<endl;
	cout<<"Size of wchar_t(in bytes) = "<<sizeof(wchar_t)<<endl;
	cout<<"Size of int(in bytes) = "<<sizeof(int)<<endl;
	cout<<"Size of short int(in bytes) = "<<sizeof(short int)<<endl;
	cout<<"Size of long int(in bytes) = "<<sizeof(long int)<<endl;
	cout<<"Size of float(in bytes) = "<<sizeof(float)<<endl;
	cout<<"Size of double(in bytes) = "<<sizeof(double)<<endl;
	cout<<"Size of long double(in bytes) = "<<sizeof(long double)<<endl;
	cout<<"Size of boolean(in bytes) = "<<sizeof(bool)<<endl;
	
	return 0;
}
