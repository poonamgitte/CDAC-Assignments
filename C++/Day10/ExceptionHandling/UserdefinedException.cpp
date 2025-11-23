#include<iostream>
using namespace std;

class InvalidSalaryExpection : public exception{
    public:
        const char *what() const noexcept override{
            return "Salary can not be <5000";
        }
};

int main(){
    double sal;
    try{
        cout<<"Enter salary"<<endl;
        cin>>sal;
    
        if(sal<5000){
            throw InvalidSalaryExpection();
        }
    
        cout<<"Salary:"<<sal;

    }catch(InvalidSalaryExpection& e){
        cout<<e.what();
    }
    catch(...){
        cout<<"Error occur"<<endl;
    }
}