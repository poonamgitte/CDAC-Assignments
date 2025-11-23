#ifndef C_
#define C_

#include<iostream>
#include<cstring>
#include<vector>
using namespace std;

#include"Car.cpp"
#include"Person.cpp"

class Customer: public Person{
        int id;
        vector<Car>carr;

    public:
        Customer():id(0){}

        Customer(int i, string nm, string addr):Person(nm, addr){
            id = i;
        }

        ~Customer(){}

        //Setter methods
        void setId(int i){
            id = i;
        }

        //Getter methods
        int getId(){
            return id;
        }

        //Display
        void display(){
            cout<<"Cusomer id: "<<id<<endl;
            Person::display();
        }

        //Purchase car
        void addCar(Car c){
            carr.push_back(c);
        }

        //Display Customers all cars
        void displayCars(){
            if(carr.empty()){
                cout<<"No car purchased!"<<endl;
            }
            else{
                cout<<"-------------------------------"<<endl;
                cout<<"All cars purchased by "<<name<<endl;
                cout<<"-------------------------------"<<endl;

                for(int i=0; i<carr.size();i++){
                    carr[i].displayCar();
                    cout<<"----------------------"<<endl;

                }
            }
        }

};

#endif