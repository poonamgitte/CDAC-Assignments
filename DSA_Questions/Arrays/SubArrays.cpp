//Prints unique subarrays in array
// time complexity O(n^3)----> worst 

#include<iostream>
using namespace std;

void subArrays(int arr[], int n){

    int cnt=0;
    int max_sum = INT_MIN;
    int min_sum = INT_MAX;
    for (int i=0; i<n; i++){

        for(int j=i; j<n; j++){
            int sum=0;
            cout<<"[ ";
            for(int k=i; k<=j;k++){
                cout<<arr[k]<<" ";
                sum += arr[k];
            }
            cout<<"] ";
            cnt++;

            cout<<"sum:"<<sum<<" ";

            if(sum > max_sum){
                max_sum = sum;
            }

            if(sum < min_sum){
                min_sum = sum;
            }
        }
        cout<<endl;
    }

    cout<<"Total subarray:"<<cnt<<endl;
    cout<<"Max sum:"<<max_sum<<endl;
    cout<<"min sum:"<<min_sum<<endl;
}

int main(){
    int arr[] = {1,-2,6,-1,3};
    int n = sizeof(arr)/sizeof(int);
    
    cout<<"Unique pairs:"<<endl;
    subArrays(arr,n);
}