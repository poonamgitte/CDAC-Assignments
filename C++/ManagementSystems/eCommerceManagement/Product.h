#ifndef Product_h
#define Product_h

#include<cstring>
#include<iostream>
using namespace std;

class Product{
    int prod_id;
    string prod_name;
    double price;

    public:
        Product();
        Product(int id, string pnm, double p);
        ~Product();

        //Setter methods
        void setId(int id);
        void setPname(string pnm);
        void setPrice(double p);

        //Getter methods
        int getId();
        string getPname();
        double getPrice();

        //display
        void display();
};

#endif