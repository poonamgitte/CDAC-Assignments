#include<iostream>
using namespace std;

class myArr{
    int arr[5];
    public:
        //Default constructor
        myArr(){

            for(int i=0; i<5;i++){
                arr[i] = 0;
            }
        }

        //Parameterised constructor
        myArr(int a[5]){
             for(int i=0; i<5;i++){
                arr[i] = a[i];
            }
        }

        //Copy Constructor
        // Overload(Overload& ob){
        //     this->i = ob.i;
        //     this->j = ob.j;
        // }

        //Display 
        void display(){
           // cout<<"Array elements : "<<endl;
            for(int i=0; i<5;i++){
                cout<<arr[i]<<" ";
            }
            cout<<endl;
        }

        //[] operator overload
        int operator [](int i){

            if(i >=0 && i<5){
                return arr[i];
            }
            else{
                cout<<"Out of range"<<endl;
                return -1;
            }
        }

        //+ Operator overload
        myArr operator +(myArr& other){
            myArr temp;
            for(int i=0; i<5; i++){
                temp.arr[i] = this->arr[i] + other.arr[i];
            }

            return temp;
        }

        //- Operator overload
        myArr operator -(myArr& other){
            myArr temp;
            for(int i=0; i<5; i++){
                temp.arr[i] = this->arr[i] - other.arr[i];
            }

            return temp;
        }

        //* Operator overload
        myArr operator *(myArr& other){
            myArr temp;
            for(int i=0; i<5; i++){
                temp.arr[i] = this->arr[i] * other.arr[i];
            }

            return temp;
        }

        // / Operator overload
        myArr operator /(myArr& other){
            myArr temp;
            for(int i=0; i<5; i++){
                temp.arr[i] = this->arr[i] / other.arr[i];
            }

            return temp;
        }

        
};

int main(){

    int arr[5] = {100,200,300,400,500};
    int arr2[5] = {10,20,30,40,50};

    myArr A1(arr), A2(arr2);
    cout<<"Array1: ";
    A1.display();

    cout<<"Array2: ";
    A2.display();

    myArr sum = A1+A2;
    
    cout<<"Array sum: ";
    sum.display();

    myArr sub = A1-A2;
    
    cout<<"Array subtraction: ";
    sub.display();

    myArr mul = A1*A2;
    
    cout<<"Array multiplication: ";
    mul.display();

    myArr div = A1/A2;
    
    cout<<"Array division: ";
    div.display();

    cout<<"Array1 index 3 element : "<<A1[3]<<endl;

    return 0;
}