#include<iostream>
#include<cstring>
using namespace std;

class Car{
    int cid;
    string cname;
    double price;

    public:
        Car():cid(0), cname(""),price(0.0){}

        Car(int id, string cnm, double p ){
            cid = id;
            cname = cnm;
            price = p;
        }
        ~Car(){}

        //setter methods
        void setCid(int id){
            cid = id;
        }

        void setCname(string c){
            cname = c;
        }

        void setPrice(double p){
            price = p;
        }

        //Getter method
         int getCid(){
            return cid;
        }

        string getCname(){
            return cname ;
        }

        double getPrice(){
            return price;
        }

        void displayCar(){
            cout<<"Car Id: "<<cid<<endl;
            cout<<"Car name: "<<cname<<endl;
            cout<<"Car price: "<<price<<endl;
        }

};