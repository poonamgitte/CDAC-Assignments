#include<iostream>
using namespace std;


int main(){
    int n, d;

    try{
        cout<<"Enter n and d"<<endl;
        cin>>n>>d;
    
        if(d == 0){
            throw runtime_error("Division by zero error");
        }
    
        int result = n/d;
        cout<<"Result:"<<result<<endl;

        int arr[5] = {10,20,30,40,50};

        for(int i=0; i<=5;i++){

            if(i >=5){
                throw out_of_range("i is outof scope");
            }
            cout<<arr[i]<<" ";
        }

        
        cout<<endl<<"End of the main"<<endl;
    }catch(runtime_error& e){
        cout<<"Runtime error "<<e.what()<<endl;
    }catch(out_of_range& x){
        cout<<"Out of range exception"<<x.what()<<endl;
    }
    catch(...){
        cout<<"This is generic class "<<endl;
    };


    return 0;
}