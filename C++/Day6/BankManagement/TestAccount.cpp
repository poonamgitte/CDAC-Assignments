#include<iostream>
using namespace std;

#include"Account.h"
#include"CurrentAccount.h"
#include"SavingAccount.h"

int main(){

	Account ob2("Rohini", "Sawase", 9087654323, "rohini@gmail.com");
	cout<<endl<<"Accout 1 : "<<endl;
	ob2.display();
		
	  
	Account* ob = new CurrentAccount("poonam", "gitte", 8468910918, "poonam@gmail.com",50); 
	cout<<endl<<"Accout 2 : "<<endl;
	ob->display();
	

	Account* ob3 = new SavingAccount("poonam", "gitte", 8468910918, "poonam@gmail.com",50);
	cout<<endl<<"Accout 3 : "<<endl;
	ob3->display();
	
	delete ob;
	delete ob3;
	  
    return 0;
}
