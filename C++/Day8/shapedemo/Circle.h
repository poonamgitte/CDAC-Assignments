#include <iostream>
using namespace std;
#include "Shape.h"

class Circle : public Shape {
	double radius;
	
	public:
		Circle();
		Circle(const char* color, double radius);
		~Circle();
		
		// Setter Methods
		void setRadius(double radius);
		
		// Getter Methods
		double getRadius();
		
		// Other Methods
		double calcArea();
		double calcPerimeter();
		
		// Display
		void display() const;
};
