//Testing File for menu driven program of 2D Array

#include<iostream>
#include"Array2D.cpp"
using namespace std;

//const int ROW = 3;
//const int COL = 3;

int main(){
	int Mat1[ROW][COL]={{1,2,3},{4,5,6},{7,8,9}};
	
	int Mat2[ROW][COL]={{1,2,3},{4,5,6},{7,8,9}};
	
	int choice;
	
	cout<<"Menu driven for 2D Array"<<endl;
	cout<<"Choices of menu:"<<endl; 	
	cout<<"1. add 2 matrices:"<<endl;
	cout<<"2. transpose of matric:"<<endl;
	cout<<"3. multiplication of 2 matrices"<<endl;
	cout<<"4. find sum of all values"<<endl;
	cout<<"5. find maximum number"<<endl;
	cout<<"6. find minimum number"<<endl;
	cout<<"7. find rowwise maximum"<<endl;
	cout<<"8. find rowwise minimum"<<endl;
  	cout<<"9. find columnwise maximum"<<endl;
	cout<<"10. find columnwise minimum"<<endl;
	cout<<"11. find rowwise sum"<<endl;
	cout<<"12. find columnwise sum"<<endl;
	cout<<"13. Subtraction of matrices"<<endl;
	cout<<"14.Exit"<<endl;

	do{
		
		
		cout<<endl<<"Enter choice:"<<endl;
		cin>>choice;
		
		switch(choice){
			case 1:
				int result[ROW][COL];
				MyClass::display(Mat1);
				MyClass::display(Mat2);
				
				MyClass::AddMatrix(Mat1, Mat2, result);
				cout<<"Addition of Matrix:"<<endl;
				MyClass::display(result);
				break;
			case 2:
				int result2[ROW][COL];
				cout<<"Original Matrix:"<<endl;
				MyClass::display(Mat1);
				
				MyClass::Transpose(Mat1,result2);
				
				cout<<"Transpose of Matrix:"<<endl;
				MyClass::display(result2);
				break;
				
				
			case 3:
				int result3[ROW][COL];
				MyClass::display(Mat1);
				MyClass::display(Mat2);
				
				MyClass::Multiplication(Mat1, Mat2, result3);
				cout<<"Multiplication of Matrix:"<<endl;
				MyClass::display(result3);
				break;
			case 4:
				int sum;
				MyClass::display(Mat1);
				
				sum = MyClass::SumOfMatrix(Mat1);
				
				cout<<"Sum of matrix:"<<sum<<endl;

				break;
			case 5:
				int max;
				MyClass::display(Mat1);
				
				max = MyClass::MaxNum(Mat1);
				
				cout<<"Maximum element of matrix:"<<max<<endl;
				break;
			case 6:
				int min;
				MyClass::display(Mat1);
				
				min = MyClass::MinNum(Mat1);
				
				cout<<"Minimum element of matrix:"<<min<<endl;
				break;
			case 7:
				int MaxArr[ROW];
				MyClass::display(Mat1);
				
				MyClass::RowMax(Mat1, MaxArr);
				
				cout<<"Rowwise maximum elements of array:";
				MyClass::display1D(MaxArr);
				break;
			case 8:
				int MinArr[ROW];
				MyClass::display(Mat1);
				
				MyClass::RowMin(Mat1, MinArr);
				
				cout<<"Rowwise minimum elements of array:";
				MyClass::display1D(MinArr);
				break;
			case 9:
				int MaxArr2[COL];
				MyClass::display(Mat1);
				
				MyClass::ColumnMax(Mat1, MaxArr2);
				
				cout<<"Column wise maximum elements of array:";
				MyClass::display1D(MaxArr2);
				break;
			case 10:
				int MinArr2[COL];
				MyClass::display(Mat1);
				
				MyClass::ColumnMin(Mat1, MinArr2);
				
				cout<<"Column wise minimum elements of array:";
				MyClass::display1D(MinArr2);
				break;
			
			case 11:
				int sumArr1[ROW], maxSum ;
				MyClass::display(Mat1);
				
				maxSum = MyClass::RowSum(Mat1, sumArr1);
				
				cout<<"Rowwise sum of elements of array:";
				MyClass::display1D(sumArr1);
				
				cout<<"Rowwise maximum sum:"<<maxSum<<endl;
				break;
			
			case 12:
				int sumArr2[COL];
				MyClass::display(Mat1);
				
				MyClass::ColumnSum(Mat1, sumArr2);
				
				cout<<"Columnwise sum of elements of array:";
				MyClass::display1D(sumArr2);
				break;
				
			case 13:
				int result4[ROW][COL];
				MyClass::display(Mat1);
				MyClass::display(Mat2);
				
				MyClass::SubtractMatrix(Mat1, Mat2, result4);
				cout<<"Subtraction of Matrix:"<<endl;
				MyClass::display(result4);
				break;
				
			case 14:
				break;
			
			default:
				cout<<"enter valid choice!"<<endl;
				break;
		}
		
	}while(choice != 13);
	
	return 0;	
}
