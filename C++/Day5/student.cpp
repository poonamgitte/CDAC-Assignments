#include<iostream>
using namespace std;

class student{

    private:
        int stuid;
        char name[10];
        int marks[3];
    public:
        void acceptData(){

            cout<<"Enter Id:"<<endl;
            cin>>stuid;
            cout<<"Enter Name of student:"<<endl;
            cin>>name;
            cout<<"Enter marks of three subjects"<<endl;
            for(int i=0;i<3;i++){
                cout<<"Marks of "<<i<<" = ";
                cin>>marks[i];
            }
        }
        void display(){
            
            cout<<"Student Id ->"<<stuid<<endl;
            cout<<"Name :"<<name<<endl;
            for(int i=0;i<3;i++){
                cout<<"Marks["<<i<<"] : "<<marks[i]<<endl;
            }
        }
        
};
int main(){

        student arr[2];

        for(int i=0;i<2;i++){
            cout<<"Enter details of student"<<i+1<<endl;
            arr[i].acceptData();
        }

        cout<<"\n----Students Details----\n";
        for(int i=0;i<2;i++){
            arr[i].display();
        }
    
        
        return 0;
}
