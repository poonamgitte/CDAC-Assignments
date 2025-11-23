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
        // void display(){
        //     cout<<"Values :"<<endl;
        //     cout<<" i = "<<i<<" j = "<<j<<endl;
        // }

        //pre increment
        Overload& operator ++(){
            this->i++;
            this->j++;
            return *this;
        }

        //post increment
         Overload operator ++(int){
            Overload a = *this;
            this->i++;
            this->j++;
            return a;
        }

         //pre decrement
        Overload& operator --(){
            this->i--;
            this->j--;
            return *this;
        }

        //post decrement
         Overload operator --(int){
            Overload a = *this;
            this->i--;
            this->j--;
            return a;
        }

        friend ostream& operator <<(ostream & out, const Overload& c);
        friend istream& operator >>(istream& in, Overload& c);
        
};

ostream& operator <<(ostream & out, const Overload& c){
    out<<c.i<<"+"<<c.j<<"="<<c.i+c.j<<endl;
    return out;
}

istream& operator >>(istream& in, Overload& c){
    cout<<"Enter i:"<<endl;
    in>>c.i;
    cout<<"Enter j:"<<endl;
    in>>c.j;

    return in;
}


int main(){
    Overload o; //Default constructor called
   // o.display();

    //>> overloading
    cin>>o;

    //<< Overloading
    cout<<o;

    // Overload o1(10,20), o3(30,40);  //parameterised constructor called
    // o1.display();
    // o3.display();

    // Overload pre = ++o1;
    // cout<<"Pre increment"<<endl;
    // pre.display();
    // o1.display();

    // Overload post = o3++;
    // cout<<"Post increment"<<endl;
    // post.display();
    // o3.display();

    // Overload pred = --o1;
    // cout<<"Pre decrement"<<endl;
    // pred.display();
    // o1.display();

    // Overload postd = o3--;
    // cout<<"Post decrement"<<endl;
    // postd.display();
    // o3.display();


   
    return 0;
}