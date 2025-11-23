
#include<iostream>
#include<cstring>
using namespace std;
#include"Student.h"
#include"MSCstudent.h"
#include"PHDstudent.h"


class StudentService{
	private:
		static Student* ptr[100];
	        static int count;
	        
	public:
		static void AcceptData(int n);
		static void displayAll();  
		static void displayPHD();
		static void displayMSC();
		static Student* searchById(int id);
		static int searchByName(char* name, Student* result[100]);
		static void sortByM1();
		static void percentList();
};
