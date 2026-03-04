// leader is the element greater than all its right hand size

public class Q24_LeaderElement {
    public static void main(String[] args) {
        
        int arr[] = {3,5,1,10,5,6,9,1};

        int max = Integer.MIN_VALUE;

        for(int i=arr.length-1;i>=0;i--){

            max = Math.max(max,arr[i]);

            if(max == arr[i])
                System.out.println(arr[i]);
        }
    }
}
