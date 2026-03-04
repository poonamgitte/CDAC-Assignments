public class Q17_FirstOccurance_InArray {
    public static int firstOccurance(int[] arr, int n, int element){

        if(n == arr.length){
            return -1;
        }

        if(arr[n] == element){
            return n;
        }

        return firstOccurance(arr,n+1,element);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,1,3};

        System.out.println("Occurances:"+firstOccurance(arr,0,3));
    }
}
