#include"Person.h"
#include"Product.h"
#include<vector>
#include<iostream>
using namespace std;

class Seller: public Person{
    int seller_id;
    vector<Product>products;
    // Product products[100];
    // int pcount;

    public:

        Seller();
        Seller(int id, string nm);
        ~Seller();

        //Setter methods
        void setSellerId(int id);

        //Getter method
        int getSellerId();
        string getSellerName();

        //display method
        void display();

        //Adding product
        void AddProduct(Product p);

        //Display all products for specific seller
        void displayProducts();

        //Display all product
        void displayAllProductsOnly(); 
};

