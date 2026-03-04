import java.util.Arrays;

public class Merge_Sorted_Array {

     static void display(int[] arr, int n){
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,4,5,7};
        int[] arr2 = {3,6,8};

        int m = arr1.length;
        int n = arr2.length;

        int[] merge = new int[m+n];

        int i = 0, j = 0, k = 0;

        while(i < m && j < n){
            if(arr1[i] <= arr2[j]){
                merge[k++] = arr1[i++];
            }
            else if( arr1[i] > arr2[j]){
                merge[k++] = arr2[j++];
            }
        }

        while(i<m){
            merge[k++] = arr1[i++];
        }
        
        while(j<n){
            merge[k++] = arr2[j++];
        }

        //display(merge, k);

        System.out.println(Arrays.toString(merge));

       

    }
}
