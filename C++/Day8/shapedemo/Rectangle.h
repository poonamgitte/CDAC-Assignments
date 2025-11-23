#include <iostream>
using namespace std;
#include "Shape.h"

class Rectangle : public Shape {
	double length;
    double width;
	
	public:
		Rectangle();
		Rectangle(const char* color, double l, double w);
		~Rectangle();
		
		// Setter Methods
		void setLength(double l);
        void setWidth(double w);
		
		// Getter Methods
		double getLength();
        double getWidth();
		
		// Other Methods
		double calcArea();
		double calcPerimeter();
		
		// Display
		void display() const;
};
