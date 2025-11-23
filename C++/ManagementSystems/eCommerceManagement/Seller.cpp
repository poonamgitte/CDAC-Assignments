#include<iostream>
#include<cstring>
using namespace std;

#include"Seller.h"

Seller::Seller(){
    seller_id = 0;
    //pcount =0;
}
Seller::Seller(int id, string nm) : Person(nm) {
    seller_id = id;
    //pcount = 0;
}

Seller::~Seller(){}

//Setter methods
void Seller::setSellerId(int id){
    seller_id = id;
}

//Getter method
int Seller::getSellerId(){
    return seller_id;
}

string Seller::getSellerName(){
    return name;
}

//display method
void Seller::display(){
    Person::display();
    cout<<"Seller id:"<<seller_id<<endl;
}

//Add product 
void Seller::AddProduct(Product p){

    if(products.size() < 100){
        //products[pcount++] = p;
        products.push_back(p);
    }
    else{
        cout<<"Product limit reached for seller!"<<endl;
    }
}

//Display Seller Products
void Seller::displayProducts(){

    if(products.empty()){
        cout<<"No product for this seller."<<endl;
        return;
    }
    cout<<"--------------------------------"<<endl;
    cout<<"Product sold by seller "<< name<<endl;
    cout<<"--------------------------------"<<endl;

        for(int i=0;i<products.size();i++){
            products[i].display();
            cout<<"------------------"<<endl;
        }
    
}

void Seller::displayAllProductsOnly() {
    for(int i=0; i<products.size(); i++) {
        products[i].display();
        cout<<"-------------------"<<endl;

    }
}