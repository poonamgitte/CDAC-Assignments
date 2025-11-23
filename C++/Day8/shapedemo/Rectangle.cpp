#include<iostream>
using namespace std;

#include"Rectangle.h"

Rectangle::Rectangle(){
    length = 0.0;
    width = 0.0;
}
Rectangle::Rectangle(const char* color, double l, double w) : Shape(color) {
    length = l;
    width = w;
}
Rectangle::~Rectangle(){}


// Setter Methods
void Rectangle::setLength(double l){
    length = l;
}
void Rectangle::setWidth(double w){
    width = w;
}

// Getter Methods
double Rectangle::getLength(){
    return length;
}
double Rectangle::getWidth(){
    return width;
}

// Other Methods
double Rectangle::calcArea(){
    return (length*width);
}
double Rectangle::calcPerimeter(){
    return (2*(length + width));
}

// Display
void Rectangle::display() const{
    cout<<"Rectangle"<<endl;
    Shape::display();
    cout<<"Length:"<<length<<endl;
    cout<<"Width:"<<width<<endl;
}