#include"Person.h"

class PersonService{

	private:
		static Person* parr[100];	
		static int count;
	public:
		static void AcceptData();
		static void AddPerson(Person &p1);
		static void DisplayAll();
		static Person* SearchById(int id );
		static int SearchByName(char* name, Person* result[100]);
		static Person* ModifyAddr(int id, char* street, char* city, char* state, int pin);
		static Person* FindAddress(int id);
		static int FindByCity(char* city, Person* result[100]);
};
