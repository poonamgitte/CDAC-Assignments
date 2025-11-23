#include<iostream>
#include<cstring>
#include<vector>
using namespace std;

#include"Player.h"

Player::Player(): pid(0), mobileno(0){}

Player::Player(int id, string nm, int ag, long long int mno): Person(nm, ag){
    pid = id;
    mobileno = mno;
}

Player::~Player(){

}

//Setter
void Player::setPid(int id){
    pid = id;
}
void Player::setMobileNo(long long int mno){
    mobileno = mno;
}

//Getter
int Player::getPid(){
    return pid;
}
long long int Player::getMobileNo(){
    return mobileno;
}

//Display
void Player::display(){
    cout<<"Player id: "<<pid<<endl;
    Person::display();
    cout<<"Mobile number: "<<mobileno<<endl;
}

//Enroll player intosport
void Player::EnrollPlayer(Sports s){
    enrolledSports.push_back(s);
}

//Display enroll Sports
void Player::displaySports(){

    if(enrolledSports.empty()){
        cout<<"No sport enrolled by player "<<name<<endl;
    }
    else{
        cout<<"Sports enrolled by Player "<<name<<endl;
        for(int i=0; i<enrolledSports.size(); i++){
            enrolledSports[i].displaySport();
            cout<<"--------------------"<<endl;
        }
    }
}