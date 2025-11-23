#include<iostream>
#include<cstring>
#include<vector>
using namespace std;

#include"SportService.h"
#include"Sports.h"

vector<Player>allPlayers;
vector<Sports>allSports;

//Add player
void SportService::AddPlayer(int id, string nm, int age, long long int mno){

    allPlayers.push_back(Player(id,nm, age, mno));
    cout<<"Player added successfully"<<endl;
}

//Add sport in sport list
void SportService::AddSport(string snm, double f){

    allSports.push_back(Sports(snm, f));
    cout<<"Sport added successfully"<<endl;

}

//Enroll player into sport
void SportService::EnrollPlayerIntoSport(int pid, string sname){

    for(int i=0; i<allPlayers.size(); i++){

        if(allPlayers[i].getPid() == pid ){

            for(int j=0; j<allSports.size();j++){

                if(allSports[j].getSname() == sname){

                    allPlayers[i].EnrollPlayer(allSports[j]);

                    cout<<"Player Enrolled!"<<endl;
                    return;
                }
            }

            cout<<"Sport not found!"<<endl;
            return;
        }
    }

    cout<<"Player not found!"<<endl;
}

//Display all players
void SportService::displayAllPlayers(){
     if(allPlayers.empty()){
        cout<<"No player found"<<endl;
    }else{
        cout<<"---------All players---------"<<endl;
        for(int i=0; i<allPlayers.size();i++){
            allPlayers[i].display();
         }
    }
}

//Display all sports
void SportService::displayAllSports(){

    if(allSports.empty()){
        cout<<"Sports not found"<<endl;
    }
    else{
        cout<<"---------All Sports-----------"<<endl;
            for(int i=0; i<allSports.size();i++){
            allSports[i].displaySport();
        }

    }
}


//Display all sports enrolled for given player
void SportService::displayPlayerSports(int pid){

    for(int i=0; i<allPlayers.size(); i++){

        if(allPlayers[i].getPid() == pid){
            allPlayers[i].displaySports();
            return;
        }
    }
    cout<<"Player not found"<<endl;
}


//Display all players with enrolled sports
void SportService::displayAllPlayerwithSports(){

    if(allPlayers.empty()){
        cout<<"No player found"<<endl;
    }
    else{
        cout<<"-----------------------------------"<<endl;
        cout<<"All Players with enrolled sport"<<endl;
        cout<<"-----------------------------------"<<endl;
    
        for(int i=0; i<allPlayers.size(); i++ ){
            allPlayers[i].display();
            allPlayers[i].displaySports();
            cout<<"-----------------------------"<<endl;
    
        }
    }
}