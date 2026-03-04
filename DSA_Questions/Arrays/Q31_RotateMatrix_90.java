

public class Q31_RotateMatrix_90 {

    // Approach (Optimal)   In place 
    // to rotate matrix inplace 
    // 1. tranpose matrix
    // 2. reverse row wise

    public static void rotate(int matrix[][]){

        int n = matrix.length;

        //1
        tranpose(matrix);

        //2
        reverse(matrix);

    }

    // For square matrix
    static void tranpose(int matrix[][]){
                
        int n = matrix.length;

        for(int i=0; i<n-1;i++){
            for(int j =i+1;j<n;j++){
            
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }

    // reverse row
    static void reverse(int matrix[][]){

        int n = matrix.length;

        for(int i=0;i<n;i++){

            int left =0;
            int right = n-1;
            
            while(left < right){
                int temp =matrix[i][left] ;
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }

        }

    }



    static void display(int matrix[][]){
        int m=matrix.length;
        int n = matrix[0].length;

        for(int i=0; i<m;i++){
            for(int j=0; j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Original matrix:");
        display(matrix);
        
        rotate(matrix);

        System.out.println("90deg rotated matrix:");
        display(matrix);
    }
}
