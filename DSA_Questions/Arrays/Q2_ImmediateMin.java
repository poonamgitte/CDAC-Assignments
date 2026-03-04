//Binary search

// Immediate min => minimum number less than given number

public class Q2_ImmediateMin {

    static int ImmediateMin(int arr[], int target){

        int start = 0;
        int end = arr.length-1;

        if(target <= arr[start]){
            return -1;
        }

        while(start <= end){
            int mid = (start + end)/2;

            if(target == arr[mid]){
                return arr[mid-1];
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return arr[end];
    }

    public static void main(String[] args) {
        int arr[] = {14,16,17,18,20,22};
        
        int num=14;
        System.err.println("Immediate min value:"+ImmediateMin(arr, num));
    }


}
