#ifndef SH_
#define SH_
#include<iostream>
#include<cstring>
using namespace std;

class Sports{
    string sname;
    double fees;

    public:
        Sports();
        Sports(string snm, double f);
        ~Sports();

        //Setter methods
        void setSname(string snm);
        void setFees(double f);

        //Getter methods
        string getSname();
        double getFees();

        //Display
        void displaySport();

};

#endif