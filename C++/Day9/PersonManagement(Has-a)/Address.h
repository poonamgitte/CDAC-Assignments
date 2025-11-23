
#ifndef EP_H
#define EP_H


class Address{

	char* street;
	char* city;
	char* state;
	int pin;
	
	public:
	
		Address();
		Address(char* street, char* city, char* state, int pin);
		~Address();
		
		//Setters
		void setStreet(char* st);
		void setCity(char* c);
		void setState(char* s);
		void setPin(int pin);
		
		// Getter methods
		char* getStreet();
		char* getCity();
		char* getState();
		int getPin();
		
		void display();
};

#endif
