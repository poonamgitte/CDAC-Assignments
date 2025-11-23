#include<iostream>
using namespace std;

class Overload{
    int i;
    int j;

    public:
        //Default constructor
        Overload():i(0),j(0){}

        //Parameterised constructor
        Overload(int i, int j){
            this->i = i;
            this->j = j;
        }

        //Copy Constructor
        // Overload(Overload& ob){
        //     this->i = ob.i;
        //     this->j = ob.j;
        // }

        //Display 
        void display(){
            cout<<"Values :"<<endl;
            cout<<" i = "<<i<<" j = "<<j<<endl;
        }

        //+ overloading
        Overload operator +(Overload& other){
            Overload temp;
            temp.i = this->i + other.i;
            temp.j = this->j + other.j;

            return temp;
        }

        //- overloading
        Overload operator -(Overload& other){
            Overload temp;
            temp.i = this->i - other.i;
            temp.j = this->j - other.j;

            return temp;
        }

        //* overloading
        Overload operator *(Overload& other){
            Overload temp;
            temp.i = this->i * other.i;
            temp.j = this->j * other.j;

            return temp;
        }

        //  / overloading
        Overload operator /(Overload& other){
            Overload temp;
            temp.i = this->i / other.i;
            temp.j = this->j / other.j;

            return temp;
        }

        // = Operator overload
        Overload operator=(Overload& other){
            cout<<"Inside ="<<endl;
            this->i = other.i;
            this->j = other.j;

            return *this;
        }
};

int main(){
    Overload o; //Default constructor called
    o.display();

    Overload o1(10,20), o3(30,40);  //parameterised constructor called
    o1.display();
    o3.display();

   Overload o2 = o1;   //Copy constructor called
   cout<<"O2:"<<endl;
   o2.display();

    Overload sum = o1+o3;   //o1 operator +(o3)
    sum.display();

    Overload sub = o3-o1;   //o3 operator -(o1)
    sub.display();

    Overload mul = o1*o3;   //o1 operator *(o3)
    mul.display();

    Overload div = (o3/o1);   //o3 operator /(o1)
    div.display();

    Overload ob;   //= operator called
    ob=o1;
   cout<<"Ob:"<<endl;
   ob.display();

    return 0;
}