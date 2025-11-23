//Menu driven for 2D Array
#include<iostream>
using namespace std;

const int ROW=3;
const int COL=3;

class MyClass{
	
	public:
		//display function
		static void display(int Mat1[ROW][COL]){
			
			cout<<"Matrix:"<<endl;
			for(int i=0;i<ROW;i++){
				for(int j=0;j<COL;j++){
					cout<<Mat1[i][j]<<"  ";
				}
				cout<<endl;
			}
		}
		
		//Display For 1D Array
		static void display1D(int Arr[]){
			
			for(int i=0;i<ROW;i++){
				cout<<Arr[i]<<"  ";
			}
			
			cout<<endl;
		}
		
		//Addition of Matrix
		static void AddMatrix(int Mat1[ROW][COL], int Mat2[ROW][COL], int result[ROW][COL]){
			for(int i=0;i<ROW;i++){
				for(int j=0;j<COL;j++){
					result[i][j] = Mat1[i][j] + Mat2[i][j];
				}
			}
		}
		
		//Subtraction of Matrix
		static void SubtractMatrix(int Mat1[ROW][COL], int Mat2[ROW][COL], int result[ROW][COL]){
			for(int i=0;i<ROW;i++){
				for(int j=0;j<COL;j++){
					result[i][j] = Mat1[i][j] - Mat2[i][j];
				}
			}
		}
		
		//Transpose of matrix
		static void Transpose(int Mat1[ROW][COL],int result[ROW][COL]){
			for(int i=0;i<ROW;i++){
				for(int j=0;j<COL;j++){
					result[i][j] = Mat1[j][i];
				}
			}
		}
		
		//Multiplication of matrices
		static void Multiplication(int Mat1[ROW][COL], int Mat2[ROW][COL], int result[ROW][COL]){
			for(int i=0;i<ROW;i++){
				for(int j=0;j<COL;j++){
					
					result[i][j] = 0;
					for(int k=0; k<COL;k++){
						result[i][j] += Mat1[i][k] * Mat2[k][j];
					}	
				}
			}
		}
		
		//Sum of All Elements Of Matrix
		static int SumOfMatrix(int Mat1[ROW][COL]){
		
			int sum=0;
			for(int i=0;i<ROW;i++){
				for(int j=0;j<COL;j++){
					sum += Mat1[i][j];
				}
			}
			return sum;
		}
		
		//Maximum element of matrix
		static int MaxNum(int Mat1[ROW][COL]){
		
			int max=Mat1[0][0];
			for(int i=0;i<ROW;i++){
				for(int j=0;j<COL;j++){
					
					if(Mat1[i][j] > max){
						max = Mat1[i][j];
					}
				}
			}
			return max;
		}
		
		//Minimum element of matrix
		static int MinNum(int Mat1[ROW][COL]){
		
			int min=Mat1[0][0];
			for(int i=0;i<ROW;i++){
				for(int j=0;j<COL;j++){
					
					if(Mat1[i][j] < min){
						min = Mat1[i][j];
					}
				}
			}
			return min;
		}
		
		//Rowwise Maximum element of matrix
		static void RowMax(int Mat1[ROW][COL], int MaxArr[ROW]){
		
			for(int i=0;i<ROW;i++){
			
				int max = Mat1[i][0];
				for(int j=0;j<COL;j++){
					
					if(Mat1[i][j] > max){
						max = Mat1[i][j];
					}
				}
				MaxArr[i] = max;
			}	
		}
		
		
		//Rowwise Minimum element of matrix
		static void RowMin(int Mat1[ROW][COL], int MinArr[ROW]){
		
			for(int i=0;i<ROW;i++){
			
				int min = Mat1[i][0];
				for(int j=0;j<COL;j++){
					
					if(Mat1[i][j] < min){
						min = Mat1[i][j];
					}
				}
				MinArr[i] = min;
			}	
		}
		
		//Columnwise Maximum element of matrix
		static void ColumnMax(int Mat1[ROW][COL], int MaxArr[COL]){
		
			for(int j=0;j<COL;j++){
			
				int max = Mat1[0][j];
				
				for(int i =0;i<ROW;i++){
					if(Mat1[i][j] > max){
						max = Mat1[i][j];
					}
				}
				MaxArr[j] = max;
			}	
		}
		
		//Columnwise Minimum element of matrix
		static void ColumnMin(int Mat1[ROW][COL], int MinArr[COL]){
		
			for(int j=0;j<COL;j++){
			
				int min = Mat1[0][j];
				
				for(int i =0;i<ROW;i++){
					if(Mat1[i][j] < min){
						min = Mat1[i][j];
					}
				}
				MinArr[j] = min;
			}	
		}
		
		//Rowwise sum of matrix
		static int RowSum(int Mat1[ROW][COL], int SumArr[ROW]){
			
			int max=0;
			for(int i=0;i<ROW;i++){
			
				int sum=0;
				for(int j=0;j<COL;j++){
					
					sum += Mat1[i][j];
				}
				SumArr[i] = sum;
				
				if(sum > max){
					max = sum;
				}
				
			}	
			return max;
		}
		
		//Columnwise sum of matrix
		static void ColumnSum(int Mat1[ROW][COL], int SumArr[ROW]){
		
			for(int i=0;i<ROW;i++){
			
				int sum=0;
				for(int j=0;j<COL;j++){
					
					sum += Mat1[j][i];
				}
				SumArr[i] = sum;
			}	
		}
		
};


