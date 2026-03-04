import java.util.Arrays;

public class Q27_SelectionSort {

    // TC - O(n^2) sc - O(n)
    public static void selectionSort(int[] arr, int r, int c, int max){

        if(r == 0){
            return;
        }

        if( c < r){
            if(arr[max] < arr[c]){
               selectionSort(arr, r, c+1, c);
            }
            else{
                selectionSort(arr, r, c+1, max);
            }
        }
        else{
            
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr, r-1, 0, 0);
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,4,1,6};

        selectionSort(arr, arr.length-1, 0, 0);

        System.out.println(Arrays.toString(arr));
    }
}
