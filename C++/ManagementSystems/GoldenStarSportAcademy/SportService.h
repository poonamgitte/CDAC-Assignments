#include<iostream>
#include<cstring>
#include<vector>
using namespace std;

#include"Player.h"

class SportService{

    public:
        static void AddPlayer(int id, string nm, int age, long long int mno);
        static void AddSport(string snm, double f);
        static void EnrollPlayerIntoSport(int pid, string sname);
        static void displayPlayerSports(int pid);
        static void displayAllPlayers();
        static void displayAllSports();
        static void displayAllPlayerwithSports();
};