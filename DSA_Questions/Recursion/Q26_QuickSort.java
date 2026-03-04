import java.util.Arrays;

public class Q26_QuickSort {

    public static void bubbleSort(int arr[], int row, int col){

        if(row == 0)
        {
            return ;
        }

        if(col<row){
            if(arr[col] >arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }

            bubbleSort(arr, row, col+1);
        }
        else{
            bubbleSort(arr, row-1, 0);
        }
        
    }
    public static void main(String[] args) {
        
        int arr[] = {3,4,1,6};

        bubbleSort(arr, arr.length-1, 0);

        System.out.println(Arrays.toString(arr));
    }
}
