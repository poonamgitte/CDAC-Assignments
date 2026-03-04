//Binary search

//Find the ceil value for the given number 
// >= num (smallest greater num)

public class Q6_Ceil_In_Array {

    static int Ceil(int arr[], int target){

        int start = 0;
        int end = arr.length-1;

        if (target > arr[end]){
            return -1;
        }

        while(start <= end){
            int mid = (start + end)/2;

            if(target == arr[mid]){
                return arr[mid];
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
        
        int num=23;
        System.err.println("Ceil value:"+Ceil(arr,num));
    }
}
