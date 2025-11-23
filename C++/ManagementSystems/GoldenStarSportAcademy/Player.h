#include<iostream>
#include<cstring>
#include<vector>
using namespace std;

#include"Person.h"
#include"Sports.h"

class Player: public Person{
    int pid;
    long long int mobileno;
    vector<Sports>enrolledSports;

    public:
        Player();
        Player(int id, string nm, int ag, long long int mno);
        ~Player();

        //Setter
        void setPid(int id);
        void setMobileNo(long long int mno);

        //Getter
        int getPid();
        long long int getMobileNo();

        //Display
        void display();

        //Enroll player
        void EnrollPlayer(Sports s);

        //Display enroll sports
        void displaySports();

};