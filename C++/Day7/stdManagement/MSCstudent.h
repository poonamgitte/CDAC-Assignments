#include<cstring>

#include"Student.h"


class MSCstudent: public Student{
	
	private:
		static string degree;
		int Smarks;
		int Lmarks;
		double mscPer;
	public:
		MSCstudent();
		MSCstudent(int id, const char* nm, const char* ad, int m[],int sm,int lm);
		~MSCstudent();
		
		//Setter methods
		void setSmarks(int sm);
		void setLmarks(int lm);
		
		//Getter methods
		int getSmarks();
		int getLmarks();
		
		void display() const;
		void calPercent();
		double getPercent();
		
		//Student* AcceptData() override;
};

