#include "ShapeService.h"
// #include"Shape.h"

#include <iostream>
#include <cstring>
using namespace std;

Shape* ShapeService::sArr[100];
int ShapeService::count = 0;

void ShapeService::addShape(int n) {
	char color[10];
	
	cout << "Enter color: ";
	cin >> color;
	
	if (n == 1) {
		double s1, s2, base, height;
		cout << "Enter S1: ";
		cin >> s1;
		cout << "Enter S2: ";
		cin >> s2;
		cout << "Enter base: ";
		cin >> base;
		cout << "Enter height: ";
		cin >> height;
		
		sArr[count++] = new Triangle(color, s1, s2, base, height);
	}
	else if (n == 2) {
		double radius;
		cout << "Enter radius: ";
		cin >> radius;
		
		sArr[count++] = new Circle(color, radius);
	}
	else if (n == 3) {
		double side;
		cout << "Enter side: ";
		cin >> side;
		
		sArr[count++] = new Square(color, side);
	}
	else if (n == 4) {
		double length;
		double width;
		cout << "Enter Length: ";
		cin >> length;
		cout<<"Enter width:";
		cin>>width;
		
		sArr[count++] = new Rectangle(color, length, width);
	}
	else{
		cout<<"Invalid choice."<<endl;
	}
}

void ShapeService::displayAll() {
	cout << "------------All shapes---------------" << endl;
	for (int i=0; i<count; i++) {
		cout<<endl<<"Shape "<<i+1<<" --> "<<endl;
		sArr[i]->display();
	}
}

void ShapeService::displayTriangles() {
	cout << "----------All Triangles-------------" << endl;
	for (int i=0; i<count; i++) {
		if (dynamic_cast<Triangle*>(sArr[i]))
			sArr[i]->display();
	}
}

void ShapeService::displayCircles() {
	cout << "-------------Circles-------------" << endl;
	for (int i=0; i<count; i++) {
		if (dynamic_cast<Circle*>(sArr[i]))
			sArr[i]->display();
			cout << endl;
	}
}

void ShapeService::displaySquares() {
	cout << "------------Squares-------------" << endl;
	for (int i=0; i<count; i++) {
		if (dynamic_cast<Square*>(sArr[i]))
			sArr[i]->display();
			cout << endl;
	}
}

void ShapeService::displayRectangles() {
	cout << "----------Rectangles------------" << endl;
	for (int i=0; i<count; i++) {
		if (dynamic_cast<Rectangle*>(sArr[i]))
			sArr[i]->display();
			cout << endl;
	}
}

int ShapeService::searchByColor(const char* color, Shape* result[100]){
	int cnt = -1;
	for (int i=0; i<count; i++) {
		if (strcmp(sArr[i]->getColor(), color) == 0) {
			result[++cnt] = sArr[i];
		}
	}
	return cnt;
}

void ShapeService::sortByColor(){
	
	for(int i=0; i<count-1;i++){
		int minindex = i;
		
		for(int j =i+1; j<count; j++){
			int result = (strcasecmp(sArr[j]->getColor(),sArr[minindex]->getColor())) ;  // if first string is less then return -ve num

			if(result < 0){
				minindex = j;
			}
		}

		Shape* temp = sArr[i];
		sArr[i] = sArr[minindex];
		sArr[minindex] = temp;

	}
	
}

void ShapeService::calculateAllAreas(){
	for (int i=0; i<count; i++) {

		cout<<"Area:"<<sArr[i]->calcArea()<<endl;
	}
}

void ShapeService::calculateAllPerimeters(){
	for (int i=0; i<count; i++) {
		cout<<"Perimeter:"<<sArr[i]->calcPerimeter()<<endl;
	}
}





