
import java.util.Arrays;
import java.util.HashMap;

// 2 numbers sum up to target 

public class Q16_2Sum{

    public static int[] twoSum(int[] arr, int target){
        
        // O(nlogn)
        // int i=0;
        // int j=arr.length-1;
        // while(i<j){
        //     int sum = arr[i]+arr[j];
        //     if(sum == target){
        //         return new int[]{i,j};
        //     }

        //     else if(sum > target){
        //         j--;
        //     }
        //     else{
        //         i++;
        //     }
        // }
       // return new int[]{-1,-1};

       // O(n)
       HashMap<Integer,Integer>map = new HashMap<>();

       for(int i=0;i<arr.length;i++){
        int complement = target - arr[i];

        if(map.containsKey(complement)){
            return new int[]{i,map.get(complement)};
        }
        map.put(arr[i], i);
       }
       return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,6,4};
        int target = 8;

        Arrays.sort(arr);  // O(nlogn)  // 1 2 3 4 5 6 

       int index[] = twoSum(arr, target);

       System.out.println("Index: "+index[0]+" "+index[1]);

    }
}