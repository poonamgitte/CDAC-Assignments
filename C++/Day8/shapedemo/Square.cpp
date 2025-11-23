#include<iostream>
using namespace std;
#include"Square.h"

Square::Square(){
    side = 0;
}

Square::Square(const char* color, double side) : Shape(color) {
    this->side = side;
}
Square::~Square(){}

// Setter Methods
void Square::setSide(double side){
    this->side = side;
}

// Getter Methods
double Square::getSide(){
    return side;
}

// Other Methods
double Square::calcArea(){
    return (side*side);
}

double Square::calcPerimeter(){
    return (4*side);
}

// Display
void Square::display() const{
    cout<<"Square"<<endl;
    Shape::display();
    cout<<"Side :"<<side<<endl;
}