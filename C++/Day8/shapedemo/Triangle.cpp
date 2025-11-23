#include "Triangle.h"
//#include "Shape.h"
#include <iostream>
using namespace std;

Triangle::Triangle() {
	s1=0.0;
	s2=0.0;
	base=0.0;
	height=0.0;
}

Triangle::Triangle(const char* color, double s1, double s2, double base, double height) : Shape(color) {
	this->s1 = s1;
	this->s2 = s2;
	this->base = base;
	this->height = height;
}

Triangle::~Triangle() {}

double Triangle::getS1() {
	return s1;
}

double Triangle::getS2() {
	return s2;
}

double Triangle::getBase() {
	return base;
}

double Triangle::getHeight() {
	return height;
}

void Triangle::setS1(double s1) {
	this->s1=s1;
}


void Triangle::setS2(double s2) {
	this->s2 = s2;
}

void Triangle::setBase(double base) {
	this->base = base;
}

void Triangle::setHeight(double height) {
	this->height = height;
}

double Triangle::calcArea() {
	return (1/(2.0) * base * height);
}

double Triangle::calcPerimeter() {
	return s1 + s2 + base;
}

void Triangle::display() const {
	cout<<"Triangle"<<endl;
	Shape::display();
	cout << "Side-1: " << s1 << endl;
	cout << "Side-2: " << s2 << endl;
	cout << "Base: " << base << endl;
	cout << "Height: " << height << endl;
}
