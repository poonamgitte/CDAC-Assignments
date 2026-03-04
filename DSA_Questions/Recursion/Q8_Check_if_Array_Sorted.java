// Check if array is sorted or not

public class Q8_Check_if_Array_Sorted {

    public static boolean isArrSorted(int[] arr, int n){

        if(n <= 1){
            return true;
        }

        if(arr[n-1] < arr[n-2]){
            return false;
        }
            
        return isArrSorted(arr,n-1);
    }

    public static void main(String[] args){

        int arr[] = {1,2,3,1,5};

        System.out.println("Is Array sorted:"+isArrSorted(arr, arr.length));
    }
}
