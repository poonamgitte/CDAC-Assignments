//Sum of all elements of array using recursion

public class Q9_ArraySum {

    public static int arraySum(int[] arr, int n){

        if(n <= 0){
            return 0;
        }

        return arr[n-1] + arraySum(arr, n-1);
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5, 10};

        System.out.println("Array Sum:"+arraySum(arr, arr.length));
    }
}
