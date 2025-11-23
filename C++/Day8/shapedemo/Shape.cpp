#include "Shape.h"
#include<cstring>
#include<iostream>
using namespace std;

    Shape::Shape(){
       color=nullptr;
    }
    
    Shape::Shape(const char* c){
       color=new char[strlen(c)+1];
       strcpy(color,c);
    }

    void Shape::setColor(const char *c){
       delete [] color;
       color=new char[strlen(c)+1];
       strcpy(color,c);
    }
    const char* Shape::getColor(){
         return color;
    }
    
    Shape::~Shape(){
      if(color)
         delete[] color;
    }
   
     void Shape::display() const{
         cout<<"Color: "<<color<<endl;
    }

