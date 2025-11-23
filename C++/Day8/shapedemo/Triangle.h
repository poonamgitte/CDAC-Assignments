#include "Shape.h"

class Triangle : public Shape {
	double s1;
	double s2;
	double base;
	double height;
	
	public:
		Triangle();
		Triangle(const char* color, double s1, double s2, double base, double height);
		~Triangle();
		
		// Getter Methods
		double getS1();
		double getS2();
		double getBase();
		double getHeight();
		
		 // Setter Methods
		 void setS1(double s1);
		 void setS2(double s2);
		 void setBase(double base);
		 void setHeight(double height);
		 
		 // Calculate Functions
		 double calcArea();
		 double calcPerimeter();
		 
		 // Display
		 void display() const;
};
