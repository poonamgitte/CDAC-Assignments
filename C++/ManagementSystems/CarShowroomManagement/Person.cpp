#include<iostream>
#include<cstring>
using namespace std;

class Person{
    protected:
        string name;
        string address;

    public:
        Person():name(""),address(""){}

        Person(string nm, string addr){
            name = nm;
            address = addr;
        }
        virtual ~Person(){};

        //Setter methods
        void setName(string nm){
            name = nm;
        }

        void setAddress(string addr){
            address = addr;
        }

        //Getter methods
        string getName(){
            return name;
        }

        string getAddress(){
            return address;
        }

        //Display
        virtual void display(){
            cout<<"Name: "<<name<<endl;
            cout<<"Address: "<<address<<endl;
        }

};