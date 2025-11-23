#include <iostream>
using namespace std;
#include "Triangle.h"
#include "Circle.h"

int main() {
	Shape* s;
	// s = new Triangle("Red", 5.0, 3.0, 7.0, 4.0);
	s = new Circle("White", 5.0);
	
	s->display();
	cout << "Area: " << s->calcArea() << endl;
	cout << "Perimeter: " << s->calcPerimeter() << endl; 
	
	delete s;
	
	return 0;
}
