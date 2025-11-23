//Menu driven program for array
#include<iostream>
using namespace std;
#define size 6

void acceptArr(int *arr){
	
	cout<<"Enter 6 array elements:";
	for(int i =0; i<size; i++){
		cin>>arr[i];
	}
}

void display(int *arr){
	cout<<"Array elements:";
	for(int i =0; i<size; i++){
		cout<<arr[i]<<" ";
	}
	cout<<endl;
}

// function to find max of array
int maxOfArr(int *arr){
	 
	 int temp = arr[0];
	 
	 for(int i=1; i<size; i++){
	 	
	 	if(temp < arr[i]){
	 		temp = arr[i];
	 	}
	 }
	 
	 return temp;
}

// Minimum element of array
int minOfArr(int *arr){
	 
	 int temp = arr[0];
	 
	 for(int i=1; i<size; i++){
	 	
	 	if(temp > arr[i]){
	 		temp = arr[i];
	 	}
	 }
	 
	 return temp;
}

//Function to calculate sum of elements of array
int sumOfArr(int *arr){
	 
	 int sum = 0;
	 
	 for(int i=0; i<size; i++){
	 	
	 	sum += arr[i];
	 }
	 
	 return sum;
}

// Sort array
void Sort(int *arr){
	
	for(int i=0; i<size-1;i++){
		int index = i;
		for(int j = i+1; j<size;j++){
			if(arr[i] > arr[j]){
				index = j;
			}
		}
		
		int temp = arr[i];
		arr[i] = arr[index];
		arr[index] = temp;
	}
}

// Search a number in array
int searchNum(int *arr, int target){
	 
	 int low = 0;
	 int high = size-1;
	 
	 while(low <= high){
	 	int mid = (low+high)/2;
	 	
	 	if(arr[mid] == target){
	 		return mid;
	 	}
	 	else if(target < arr[mid]){
	 		high = mid-1;
	 	}
	 	else{
	 		low = mid + 1;
	 	}
	 }
	 
	 return -1;
}

//Function to find all numbers divisible by given number
void divisibleNums(int *arr, int num){
	 
	 cout<<"Numbers divisible by "<<num<<" :"<<endl;
	 for(int i=0; i<size; i++){
	 	
	 	if(arr[i] % num == 0){
	 		cout<<arr[i]<<" ";
	 	}
	 }
	 
	 cout<<endl;
	 
}



int main(){
	int choice;
	int arr[size];
	
	cout<<"Choices of menu:"<<endl<<endl; 	
	cout<<"1.find max element of array"<<endl;
	cout<<"2.find minimum element of array"<<endl;
	cout<<"3.Find sum of element of array"<<endl;
	cout<<"4.Search a number in array"<<endl;
	cout<<"5.Find all numbers divisible by given number"<<endl;
	cout<<"6.Exit"<<endl;

	do{
		
		
		cout<<endl<<"Enter choice:"<<endl;
		cin>>choice;
		
		switch(choice){
			case 1:
				
				acceptArr(arr);
				cout<<"Maximum of array: "<<maxOfArr(arr)<<endl;
				break;
			case 2:
				acceptArr(arr);
				cout<<"Minimum of array: "<<minOfArr(arr)<<endl;
				break;
			case 3:
				acceptArr(arr);
				cout<<"Sum of array elements: "<<sumOfArr(arr)<<endl;
				break;
			case 4:
				int target, index;
				acceptArr(arr);
				
				Sort(arr);
	 			cout<<"Sorted array:"<<endl;
	 			display(arr);
				
				cout<<"Enter target number to search:";
				cin>>target;
				
				index = searchNum(arr,target);
				
				if(index == -1){
					cout<<"Element does not exist"<<endl;
				} 
				else{
					cout<<"Element found at index "<<index<<endl;
				}
				break;
			case 5:
				int num;
				acceptArr(arr);
			
				cout<<"Enter number:";
				cin>>num;
				 
				divisibleNums(arr, num);
				break;
			case 6:
				break;
			default:
				cout<<"enter valid choice!"<<endl;
				break;
		}
		
		
		cout<<"Do you want to continue!.."<<endl;
		
	}while(choice != 6);
	
	return 0;
}
