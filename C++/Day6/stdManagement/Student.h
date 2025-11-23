//4. Write class hirarchy for the following. and test all classes are working correctctly 
//	Write a program to manage student information, Student can be Msc student or 
//	student can be PHD Student. for all students store id, name,address, passing percentage,
//	m1,m2,m3, degree the student receives. for MSc student store marks for special subject,language marks
//	for PHD student store name of thesis, and marks for thesis


#ifndef EMP_
#define EMP_

class Student{
	private:
		int id;
		char* name;
		char* addr;
		static int passPer;
		int marks[3];
		
	public:
		Student();
		Student(int id, const char* nm, const char* ad, int marks[]);
		~Student();
		
		//Setter methods
		void setId(int id);
		void setname(const char* nm);
		void setAddr(const char* ad);
		//void setmarks(int marks[]);
		
		//Getter methods
		int getId();
		const char* getName();
		const char* getAddr();
		
		void display() const;
		
};

#endif
