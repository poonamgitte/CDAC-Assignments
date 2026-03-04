
public class Q16_CountOccurances_InArray{

    public static int countOccurances(int[] arr, int n, int element){

        if(n == 0){
            return 0;
        }

        if(arr[n-1] == element){
            return 1+countOccurances(arr, n-1, element);
        }
        else{
            return 0+countOccurances(arr, n-1, element);

        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,1,3};

        System.out.println("Occurances:"+countOccurances(arr,arr.length,1));
    }
}