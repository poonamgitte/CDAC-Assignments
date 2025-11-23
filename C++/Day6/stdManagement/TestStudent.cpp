#include<iostream>
#include<cstring>
using namespace std;

#include"Student.h"
#include"MSCstudent.h"
#include"PHDstudent.h"

int main(){
	int marks[]={90,98,99};
	Student ob(10,"Rohini","Murud",marks);
	ob.display();
	Student* s1 = new Student(101, "Rohini", "Beed", marks);
	s1->display();
	cout<<endl;

	cout<<"===MSC Student Information====";
	int marks1[]={89,89,90};
	MSCstudent ob1(10 ,"Rohini","Murud",marks1,89,90);
	ob1.display();
	MSCstudent* s2 = new MSCstudent(101, "Rohini", "Beed", marks1,90,90);
	s2->display();
	cout<<endl;

	cout<<"===PhD Student Information====";
	int marks2[]={89,89,90};
	PHDstudent ob3(10 ,"Rohini","Murud",marks2,"CPP",90);
	ob3.display();
	PHDstudent* s3 = new PHDstudent(101, "Rohini", "Beed", marks2,"AI",90);
	s3->display();
	cout<<endl;

	
	return 0;
	

}
