#include<iostream>
#include<fstream>
using namespace std;

int main(){
    //writing in file
    ofstream fout("Data.txt",ios::app);

    if(!fout){
        cout<<"Error in opening file for writing"<<endl;
        return 1;
    }

    fout<<"This is the file handling demo"<<endl;
    fout<<"New content"<<endl;
    fout<<"Appended"<<endl;

    fout.close();

    //File reading
    ifstream fin("Data.txt");

    if(!fin){
        cout<<"Error in opening file for reading"<<endl;
        return 1;
    }

    string line;

    cout<<"File content "<<endl;

    while(getline(fin,line)){
        cout<<line<<endl;
    }

    fin.close();

    return 0;

}