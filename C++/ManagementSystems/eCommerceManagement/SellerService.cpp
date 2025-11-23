#include<iostream>
#include<cstring>
#include<fstream>
#include<vector>
using namespace std;

#include"SellerService.h"

//Seller SellerService::sarr[100];
//int SellerService::scount = 0;

vector<Seller>sarr;


//Add seller
void SellerService::AddSeller(int sid, string name){

    if(sarr.size() < 100){
        sarr.push_back( Seller(sid, name));

        ofstream fout("Seller.txt", ios::app);
        fout<<sid<<"    "<<name<<endl;
        fout.close();

        cout<<"Seller added Successfully!"<<endl;
    }
    else{
        cout<<"Seller limit reached!"<<endl;
    }
}

//Add product
void SellerService::AddProduct(int sid, int pid, string pnm, double p ){
    bool found = false;
    
    for(int i=0; i<sarr.size(); i++ ){

        if(sarr[i].getSellerId() == sid){
            sarr[i].AddProduct(Product(pid, pnm,p));

            ofstream fout("Product.txt", ios::app);
            fout<<"sid:"<<sid<<"    "<<"pid:"<<pid<<"   "<<pnm<<"   "<<p<<endl;
            fout.close();

            cout<<"Product added successfully!"<<endl;
            found = true;
            break;
        }
    }

    if(!found)
        cout<<"Seller not found."<<endl;
}

//Display all Products of specific seller
void SellerService::displaySellerProducts(int sid){
    bool found = false;

    for(int i=0; i<sarr.size();i++){

        if(sarr[i].getSellerId() == sid){
            sarr[i].displayProducts();
            found = true;
            break;
        }
    }
    if(!found)
        cout<<"Seller not found."<<endl;
}

//Display All sellers
void SellerService::displayAllSellers(){
    if(sarr.empty()){
        cout<<"No seller found"<<endl;
    }
    else{
        cout<<"--------All sellers---------"<<endl;
        for(int i=0; i<sarr.size(); i++){
            sarr[i].display();
            cout<<"-------------------"<<endl;
        }
    }
}

//Display all Products
void SellerService::displayAllProducts(){
    cout<<"----------All products----------"<<endl;

    for(int i=0; i<sarr.size();i++){
        sarr[i].displayAllProductsOnly();
    }
}