// Remove duplicate elements from array

import java.util.Arrays;

public class Remove_Duplicate {

    static void display(int[] arr, int n){
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,1,2,6,6};
        
       int n = arr.length-1;

       Arrays.sort(arr);

       int k =0;

        for(int i=0; i<n;i++){
            if(arr[i] != arr[i+1]){

                arr[k++] = arr[i];
            }
        }

        arr[k++] = arr[n-1];
        
        display(arr, k);

    }
}

