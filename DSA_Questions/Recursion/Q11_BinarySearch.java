// Binary search using recursion

public class Q11_BinarySearch{

    public static int search(int [] arr, int n, int val){

      return binarySearch(arr, 0, n-1, val);
    }

    public static int binarySearch(int[] arr, int first, int last, int val){

        if(first > last ){
            return -1;
        }

        int mid = (first + last)/2;

        if(arr[mid] == val){
            return mid;
        }
        else if(val < arr[mid]){
            return binarySearch(arr, first, mid-1, val);
        }
        else{
            return binarySearch(arr, mid+1, last, val);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Index:"+search(arr, arr.length, 4));
    }
}