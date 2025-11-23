#include<iostream>
#include<cstring>
using namespace std;
 
#include"Product.h"

Product::Product(){
    prod_id = 0;
    prod_name = "";
    price = 0.0;
}
Product::Product(int id, string pnm, double p){
    this->prod_id = id;
    prod_name = pnm;
    price = p;
}

Product::~Product(){}

//Setter methods
void  Product::setId(int id){
    this->prod_id = id;
}

void  Product::setPname(string pnm){
    prod_name =pnm;
}

void  Product::setPrice(double p){
    price =p;
}

//Getter methods
int  Product::getId(){
    return prod_id;
}

string  Product::getPname(){
    return prod_name;
}

double  Product::getPrice(){
    return price;
}

//display
void  Product::display(){
    cout<<"Product Id: "<<prod_id<<endl;
    cout<<"Product name: "<<prod_name<<endl;
    cout<<"Product price: "<<price<<endl;
}
