#include "Circle.h"
#include<iostream>
using namespace std;

Circle::Circle() {
	radius = 0.0;
}

Circle::Circle(const char* color, double radius) : Shape(color) {
	this->radius = radius;
}

Circle::~Circle(){}

void Circle::setRadius(double radius){
	this->radius = radius;
}

double Circle::getRadius() {
	return radius;
}

double Circle::calcArea() {
	return (3.14 * radius * radius);
}

double Circle::calcPerimeter() {
	return (2 * 3.14 * radius);
}
		
// Display
void Circle::display() const {
	cout<<"Circle"<<endl;
	Shape::display();
	cout << "Radius: " << radius << endl;
}
