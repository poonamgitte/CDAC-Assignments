//Binary search

// num <= given value

public class Q5_Floor_In_Array {

    static int Floor(int arr[], int target){

        int start = 0;
        int end = arr.length-1;

        if(target < start){
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
        return arr[end];
    }


    public static void main(String[] args) {
         int arr[] = {14,16,17,18,20,22};
        
        int num=19;
        System.err.println("Floor value:"+Floor(arr,num));
    }
}
