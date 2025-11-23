//Program to accept number until enter q
#include<iostream>
using namespace std;

int main()
{
	int num,product=1,sum=0,count=0;
	char choice;
	double avg;
	
	while(1){
		
		cout<<"Do you want to continue(c) or quite(q)"<<endl;
		cin>>choice;
					
		if(choice == 'c'||choice == 'C'){
			
			cout<<"Enter Number=";
			cin>>num;
			sum += num;
			count++;
			product *= num;
			continue;
		}
		else if(choice == 'q'||choice == 'Q'){
			cout<<"count="<<count<<endl;
			avg=sum/count;
			cout<<"Average = "<<avg<<endl;
			cout<<"Product ="<<product<<endl;
			cout<<"Now you quited....."<<endl;
			break;
		}
		else{
			cout<<"Enter valid choice"<<endl;
		}
		

	
	}
	return 0;
}

