public class Q18_LastOccurance {
     public static int lastOccurance(int[] arr, int n, int element){

        if(n == 0){
            return -1;
        }

        if(arr[n-1] == element){
            return n-1;
        }

        return lastOccurance(arr,n-1,element);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,1,3};

        System.out.println("Occurances:"+lastOccurance(arr,arr.length,2));
    }
}
