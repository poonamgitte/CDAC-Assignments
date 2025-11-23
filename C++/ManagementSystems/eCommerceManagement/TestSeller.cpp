#include<iostream>
#include<cstring>
using namespace std;

//#include"Seller.h"
#include"Person.h"
#include"SellerService.h"

int main(){
    // Person p("poonam");
    // p.display();

    // Seller s(12, "Poonam");
    // s.display();

    int choice;

    do{

        cout << "\n--- E-Commerce Menu ---\n";
        cout << "1. Add Seller\n";
        cout << "2. Add Product\n";
        cout << "3. Display Products by Specific Seller\n";
        cout << "4. Display All Sellers\n";
        cout << "5. Display All Products\n";
        cout << "0. Exit\n";

        cout << "Enter choice: ";
        cin>>choice;

        switch(choice){
            case 1:{
                int sid;
                string name;
                cout<<"Enter seller id: ";
                cin>>sid;

                cin.ignore();
                cout<<"Enter Seller name: ";
                getline(cin, name);

                SellerService::AddSeller(sid, name);

                break;
            }

            case 2:{
                int sid, pid;
                string pname;
                double price;

                cout<<"Enter id of seller to add product: ";
                cin>>sid;

                cout<<"Enter product id: ";
                cin>>pid;
                
                cin.ignore();
                cout<<"Enter Product name: ";
                getline(cin,pname);

                cout<<"Enter price of product: ";
                cin>>price;

                SellerService::AddProduct(sid, pid,  pname,  price);
                break;
            }
            case 3:{
                int sid;
                cout<<"Enter seller id to display all products: ";
                cin>>sid;

                SellerService::displaySellerProducts(sid);
                break;
            }
            case 4:{
                SellerService::displayAllSellers();
                break;
            }
            case 5:{
                SellerService::displayAllProducts();
                break;
            }
        }

    }while(choice != 0);

    return 0;
}
