#include<iostream>
#include<cstring>
using namespace std;

#include"CarService.cpp"

int main(){
    int choice;

    cout<<"---------------------------"<<endl;
    cout<<"Welcome to Car showroom"<<endl;
    cout<<"---------------------------"<<endl;

    do{
        cout<<"------Showroom menu-------"<<endl;
        cout<<"1.Add Customer"<<endl;
        cout<<"2.Add Car in showroom"<<endl;
        cout<<"3.Add Car to a Customer (purchase car)"<<endl;
        cout<<"4.Display all Customers"<<endl;
        cout<<"5.Display all Cars in the showroom"<<endl;
        cout<<"6.Display all Cars purchased by a specific Customer"<<endl;
        cout<<"0.Exit"<<endl;

        cout<<"enter choice"<<endl;
        cin>>choice;

        switch(choice){
            case 1:{
                int id;
                string nm, addr;

                cout<<"Enter customer id: ";
                cin>>id;

                cout<<"Enter customer name: ";
                cin.ignore();
                getline(cin,nm);

                cout<<"Enter customer Address: ";
                //cin.ignore();
                getline(cin,addr);

                CarService::AddCustomer(id, nm, addr);
                break;
            }

            case 2:{
                int cid;
                string cnm;
                double price;

                cout<<"Enter Car id: ";
                cin>>cid;

                cout<<"Enter car name: ";
                cin.ignore();
                getline(cin,cnm);

                cout<<"Enter Car Price: ";
                cin>>price;

                CarService::AddCar(cid, cnm,  price);

                break;
            }
            case 3:{
                int id;
                string cname;

                cout<<"Enter customer id to purchase car:"<<endl;
                cin>>id;

                cout<<"Enter car name customer want to purchase:"<<endl;
                cin.ignore();
                getline(cin,cname);

                CarService::purchaseCar(id, cname);

                break;
            }
            case 4:{
                CarService::displayAllCustomer();
                break;

            }
            case 5:{
                CarService::displayAllCar();
                break;
            }
            case 6:{
                int id;
                cout<<"enter customer id to find all cars: "<<endl;
                cin>>id;

                CarService::allPurchasedCars(id);
                break;
            }
        }

    }while(choice != 0);

}
