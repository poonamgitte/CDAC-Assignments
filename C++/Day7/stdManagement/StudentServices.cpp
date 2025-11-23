#include<iostream>
#include<cstring>
using namespace std;
#include"StudentServices.h"
//#include"Student.h"

Student* StudentService::ptr[100];
int StudentService::count = 0;

void StudentService::AcceptData(int n){
	
	if(n == 1){
		int id,s,l;
		char add[20];
		char nm[20];
		int m[3];
		
		cout<<"Accept MSC Student data:"<<endl;
		cout<<"Enter student id:"<<endl;
		cin>>id;
		
	
		cout<<"Enter name:"<<endl;
		cin>>nm;
		
		cout<<"Enter Address:"<<endl;
		cin>>add;
		
		cout<<"Enter marks:"<<endl;
		
		for (int i=0;i<3;i++){
			cout<<"Mark"<<i+1<<":"<<endl;
			cin>>m[i];
		}
		
		cout<<"Enter Special subject marks:"<<endl;
		cin>>s;
		
		cout<<"enter language marks:"<<endl;
		cin>>l;

		ptr[count++] = new MSCstudent(id,nm,add,m,s,l);
		
	}
	else if(n == 2){
		int id,Thm;
		char add[20];
		char nm[20];
		int m[3];
		char thn[20];
		
		cout<<"Accept PHD Student data:"<<endl;
		cout<<"Enter student id:"<<endl;
		cin>>id;
		
		cout<<"Enter name:"<<endl;
		cin>>nm;
		
		cout<<"Enter Address:"<<endl;
		cin>>add;
		
		cout<<"Enter marks:"<<endl;
		
		for (int i=0;i<3;i++){
			cout<<"Mark"<<i+1<<":"<<endl;
			cin>>m[i];
		}
		
		cout<<"Enter Thesis name:"<<endl;
		cin>>thn;
		
		cout<<"enter Thesis marks:"<<endl;
		cin>>Thm;

		ptr[count++] = new PHDstudent(id,nm,add,m,thn,Thm);
		
	}
	else{
		cout<<"Invalid choice."<<endl;
	}
}
		



//Display all students
void StudentService::displayAll(){

	cout<<"-----------All student data-----------"<<endl<<endl;
	for(int i=0;i<count;i++){
		ptr[i]->calPercent();
		cout<<endl<<"Student "<<i+1<<" data-->"<<endl;
		ptr[i]->display();
	}
}

//Display PHD student
void StudentService::displayPHD(){
	cout<<"-----------PHD student data-----------"<<endl;
	for (int i=0; i<count; i++) {
		if (dynamic_cast<PHDstudent*>(ptr[i]))
			ptr[i]->display();
			cout << endl;
	}

}

//Display MSC students
void StudentService::displayMSC(){
	cout<<"----------MSC student data-----------"<<endl;
	for (int i=0; i<count; i++) {
		if (dynamic_cast<MSCstudent*>(ptr[i]))
			ptr[i]->display();
			cout << endl;
	}

}

//Search student By Id
Student* StudentService::searchById(int id){
	
	for(int i=0;i<count;i++){
		if(ptr[i]->getId() == id){
			return ptr[i];
		}
	}
	return  nullptr;
}

//Search student by Name
int StudentService::searchByName(char* name, Student* result[100]){
	int cnt = -1;
	for(int i=0;i<count;i++){
		if((strcasecmp(ptr[i]->getName(), name)) == 0){
			result[++cnt] = ptr[i];
		}
	}
	return  cnt;
}

//Sort students by mark1
void StudentService::sortByM1(){

	for(int i=0; i<count; i++){
		int minindex = i;

		for(int j=i+1; j<count; j++){

			if(ptr[j]->getM1() < ptr[minindex]->getM1()){
				minindex = j;
			}
		}

		Student* temp = ptr[i];
		ptr[i] = ptr[minindex];
		ptr[minindex] = temp;  
	}
}


//Display percentage list of student
void StudentService::percentList(){
	cout<<"Percentage list of all students"<<endl;
	cout<<"ID		Name		Percentage		Status"<<endl;
	
	for(int i=0; i<count; i++){
		ptr[i]->calPercent();
		cout<<ptr[i]->getId()<<"		"<<ptr[i]->getName()<<"			"<<ptr[i]->getPercent()<<"		";

		if(ptr[i]->getPassPer() < ptr[i]->getPercent() ){
			cout<<"Pass"<<endl;
		}
		else{
			cout<<"Fail"<<endl;
		}
	}
}
