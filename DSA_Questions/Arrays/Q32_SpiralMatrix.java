import java.util.*;

//Spiral matrix

public class Q32_SpiralMatrix {

    public static List<Integer> spiralMatrix(int[][] matrix){

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m-1;
        int left = 0, right = n-1;

        List<Integer> list = new ArrayList<>();


        while(left <= right && top <= bottom){

            for(int i = left ;i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i<=bottom;i++ ){
                list.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){

                for(int i = right; i>= left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){

                for(int i=bottom; i>= top; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }

        }

        return list;

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

        List<Integer> list = spiralMatrix(matrix);

        System.out.println("Matrix:");
        display(matrix);

        System.out.println("Spiral list:");
        System.out.println(list);

    }
}




