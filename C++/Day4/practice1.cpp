#include<iostream>
using namespace std;

int ROW = 3;
int COL = 3;

int main(){

	// Dynamically initialized 2d array 
	int **arr;
	arr = new int*[ROW];
	
	for(int i=0;i<ROW;i++){
		arr[i] = new int[COL];
	}
	
	cout<<"Enter matrix of length 3*3:<"<<endl;
	
	for(int i=0;i<ROW;i++){
		for(int j=0; j<COL; j++){
			cin>>arr[i][j];
		}
	}
	
	cout<<"Matrix:"<<endl;
	for(int i=0;i<ROW;i++){
		for(int j=0; j<COL; j++){
			cout<<arr[i][j]<<"  ";
		}
		cout<<endl;
	}
	
}
