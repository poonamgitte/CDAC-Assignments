#ifndef PH_
#define PH_
#include<iostream>
#include<cstring>
using namespace std;


class Person{
    protected:
        string name;
        int age;

    public:
        Person();
        Person(string nm, int a);
        virtual ~Person();

        //Setter 
        void setName(string n);
        void setAge(int a);

        //Getter
        string getName();
        int getAge();

        //Display
        virtual void display();

};

#endif