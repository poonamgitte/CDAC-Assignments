//Print unique pairs in array

#include<iostream>
using namespace std;

void uniquePairs(int arr[], int n){

    for(int i=0; i<n-1; i++){
        for(int j=i+1; j<n; j++){
            cout<<"["<<arr[i]<<","<<arr[j]<<"]"<<" ";
        }
        cout<<endl;
    }
}

int main(){
    int arr[] = {2,4,6,8,10};
    int n = sizeof(arr)/sizeof(int);
    
    cout<<"Unique pairs:"<<endl;
    uniquePairs(arr,n);
}