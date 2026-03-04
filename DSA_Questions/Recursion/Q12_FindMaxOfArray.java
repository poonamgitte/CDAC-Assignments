// find maximum of array using recursion

public class Q12_FindMaxOfArray {

    public static int findMax(int [] arr, int n){

        if(n == 1){
            return arr[0];
        }

        return Math.max(arr[n-1], findMax(arr, n-1));
    }
    public static void main(String[] args) {
         int[] arr = {1,13,2,3,4,5};

         System.out.println("Maximum element:"+findMax(arr, arr.length));
    }
}
