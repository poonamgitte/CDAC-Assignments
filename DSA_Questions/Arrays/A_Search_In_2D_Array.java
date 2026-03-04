// Search in 2D array

public class A_Search_In_2D_Array {
    
    public static void main(String[] args) {
        
        int arr[][] = {{3,5,2},{1,4,7},{9,8,6}};
        int target = 7;


        int row = arr.length-1;
        int col = arr[0].length-1;

        // search in unsorted array

        // for(int i=0; i<row;i++){
        //     for(int j=0; j<col;j++){

        //         if(arr[i][j]==target){
        //             System.out.println(i+" "+j);
        //         }
        //     }
        // }

        // search in array sorted rowwise and columnwise

        int i = 0;
        int j = col;
        while (i<= j) { 
            
            if(arr[i][j] == target){
                System.out.println(i+ " "+j);
                break;
            }
            else if (arr[i][j] > target) {
                j--;
            }
            else{
                i++;
            }
        }

        // search in sorted array (Binary search)

        int m = arr.length;
        int n = arr[0].length;

        int left =0;
        int right = m*n-1;

        while(left <= right){

            int mid = left +(right-left)/2;

            int r = mid/n;
            int c = mid%n;

            if(arr[r][c] == target){
                System.out.println(r+ " "+ c);
                break;
            }
            else if(arr[r][c] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

    }
}
