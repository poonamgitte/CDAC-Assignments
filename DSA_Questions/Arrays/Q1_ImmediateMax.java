//Binary search

// Immediate max => minimum number greater than given number

public class Q1_ImmediateMax {

    static int ImmediateMax(int arr[], int target){

        int start = 0;
        int end = arr.length-1;

        if(target >= arr[end]){
            return -1;
        }

        while(start <= end){
            int mid = (start + end)/2;

            if(target == arr[mid]){
                return arr[mid+1];
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int arr[] = {14,16,17,18,20,22};
        
        int num=22;
        System.err.println("Immediate Max value:"+ImmediateMax(arr, num));
    }
}
