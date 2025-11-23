#include <iostream>
using namespace std;
#include "Shape.h"

class Square : public Shape {
	double side;
	
	public:
		Square();
		Square(const char* color, double side);
		~Square();
		
		// Setter Methods
		void setSide(double side);
		
		// Getter Methods
		double getSide();
		
		// Other Methods
		double calcArea();
		double calcPerimeter();
		
		// Display
		void display() const;
};
