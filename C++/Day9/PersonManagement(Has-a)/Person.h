#ifndef EP_
#define EP_

#include"Address.h"
class Person{
		int id;
		char* name;
		Address addr;
		static int cnt;
				
		public:

		Person();
		Person(char* name,char* st,char* c,char* s,int p);
		~Person();

		//Setters
		//void setId(int id);
		void setName(char* nm);
		

		// Getter methods
		char* getName();
		int getId();
		Address& getAddr();
		

		void display();
};

#endif
