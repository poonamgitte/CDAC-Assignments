// fing 2 elements whose sum == target

import java.util.*;

public class Q10_2Sum {

    public static int[] findNums(int arr[], int target){

        // Brute force O(n^2)
        // for(int i=0; i<arr.length-1;i++){
        //     for(int j= i+1; j<arr.length;j++){

        //         if(arr[i] + arr[j] == target){
                    
        //                 return new int[]{i,j};
        //         }
        //     }
        // }

        // return new int[]{};
        

        // Optimal using hashmap O(n)

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=0; i<arr.length;i++){

            int temp = target - arr[i];

            if(map.containsKey(temp)){
                return new int[]{map.get(temp),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int arr[] = {2,7,11,5};
        int target = 12;

        int index[] = findNums(arr, target);

        System.out.print(index[0]+ " , "+index[1]);
        
    }
}
