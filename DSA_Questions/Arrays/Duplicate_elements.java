// Find duplicate elements in array

import java.util.*;

public class Duplicate_elements {
     public static void main(String[] args) {
        int arr[] = {1,3,5,2,4,5,6};
        
        
        //brute force
        //int n = arr.length-1;
    //    Arrays.sort(arr);

    //     for(int i=0; i<n;i++){
    //         if(arr[i] == arr[i+1]){

    //             System.out.println(arr[i]+" ");
    //         }
    //     }

    // optimal using HashSet

    HashSet<Integer> set = new HashSet<>();

    for(int num: arr){
        
        if(set.contains(num)){
            System.out.println("Duplicate number:"+num);
        }

        set.add(num);
    }
    

    }
}
