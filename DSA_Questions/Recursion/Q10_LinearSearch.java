// Linear search using recursion

public class Q10_LinearSearch {

    public static int linearSearch(int [] arr, int n, int val){

        if(n == 0){

            return -1;
        }

        if(arr[n-1] == val){
            return n-1;
        }

        return linearSearch(arr, n-1, val);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Index:"+linearSearch(arr, arr.length, 3));
    }
}
