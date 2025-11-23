#include<cstring>
#include"Student.h"


class PHDstudent: public Student{
	
	private:
		static string degree;
		char* ThesisName;
		int Thmark;
	public:
		PHDstudent();
		PHDstudent(int id, const char* nm, const char* ad, int m[3],const char* Tname, int Tmark);
		~PHDstudent();
		
		//Setter methods
		void setThName(const char* Tname);
		void setThmarks(int Tmark);
		
		//Getter methods
		const char* getThName();
		int getThmarks();
		
		void display() const;
		
};
