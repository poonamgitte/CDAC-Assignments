#include<iostream>
#include<cstring>
#include<vector>
using namespace std;

#include"Customer.cpp"

static vector<Customer>customers;
static vector<Car>allCars;

class CarService{

    public:
        static void AddCustomer(int id, string nm, string addr){

            customers.push_back(Customer(id, nm,addr));
            cout<<"Customer added successfully"<<endl;
        }

        static void AddCar(int cid, string cnm, double price){
            allCars.push_back(Car(cid, cnm, price));
            cout<<"Car added successfully"<<endl;
        }

        static void displayAllCustomer(){
            if(customers.empty()){
                cout<<"Customer not found"<<endl;
            }
            else{
                cout<<"--------All customers--------"<<endl;
                for(int i=0; i<customers.size(); i++){
                    customers[i].display();
                    cout<<"------------------"<<endl;
                }
            }
        }

         static void displayAllCar(){
            if(allCars.empty()){
                cout<<"Car not found"<<endl;
            }
            else{
                cout<<"----------All Cars---------"<<endl;
                for(int i=0; i<allCars.size(); i++){
                    allCars[i].displayCar();
                    cout<<"------------------"<<endl;
                }
            }
        }

        static void purchaseCar(int id, string cname){

            for(int i=0; i<customers.size();i++){

                if(customers[i].getId() == id){

                    for(int j=0; j<allCars.size();j++){

                        if(allCars[j].getCname() == cname){

                            customers[i].addCar(allCars[j]);
                            cout<<"Car purchased!"<<endl;
                            return;
                        }
                    }
                    cout<<"Car not available!"<<endl;
                    return;
                }
            }
            cout<<"Customer not Available!"<<endl;
        }

        //Display All purchased car for given customer
        static void allPurchasedCars(int id){
            bool found = 0;
            for(int i=0; i<customers.size();i++){

                if(customers[i].getId() == id){
                    customers[i].displayCars();
                    found = 1;
                }
            }

            if(!found){
                cout<<"Customer not found!"<<endl;
            }
        }
};