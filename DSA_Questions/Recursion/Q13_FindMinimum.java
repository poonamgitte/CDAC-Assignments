public class Q13_FindMinimum {

     public static int findMin(int [] arr, int n){

        if(n == 1){
            return arr[0];
        }

        return Math.min(arr[n-1], findMin(arr, n-1));
    }
    public static void main(String[] args) {
         int[] arr = {1,13,2,3,4,5};

         System.out.println("minimum element:"+findMin(arr, arr.length));
    }
}
