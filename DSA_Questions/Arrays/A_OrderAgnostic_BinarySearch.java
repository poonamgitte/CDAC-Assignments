// OrgerAgnostic binary search -> searching for ascending as well as descending sorted array

public class A_OrderAgnostic_BinarySearch {

    public static int orderAgnosticSearch(int[] arr,int target){
        int start =0;
        int end = arr.length-1;

        boolean isAscending = false;

        if(arr[start] < arr[end]){
            isAscending = true;
        }

        return search(arr,target, start,end,isAscending);
    }

    // Search for ascending or descending array
    public static int search(int[] arr,int target, int start,int end,boolean isAscending){

        while(start <= end){
           
            int mid = start+ (end-start)/2;

            // Search in ascending array
            if(isAscending){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else if(target > arr[mid]){
                    start = mid+1;
                }
                else{
                    return mid;
                }
            }

            // Search for descending array
            else{
                if(target > arr[mid]){
                    end = mid-1;
                }
                else if(target < arr[mid]){
                    start = mid+1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,4,6,7,8};
        int target = 7;

        System.out.println("Index:"+orderAgnosticSearch(arr1,target));

        int[] arr2 = {8,7,5,4,2,1};
        System.out.println("Index:"+orderAgnosticSearch(arr2,target));

    }
}
