// Find all duplicate elements in array
import  java.util.*;

public class Q11_All_Duplicate_In_Array {
    public static void main(String[] args) {
        
        int nums[] = {1,2,1,3,4,2,5,6,5,4,2,3,7};

        // HashMap<Integer,Integer>freq = new HashMap<>();
        // for(int num: nums){

        //     freq.put(num,freq.getOrDefault(num, 0)+1);
        // }

        // for(int key:freq.keySet()){
        //     if(freq.get(key) >1){
        //         System.out.println(key+ " ");
        //     }
        // }

        HashSet<Integer>set = new HashSet<>();
        HashSet<Integer>duplicate = new HashSet<>();

        for(int num: nums){

            if(!set.add(num)){
                duplicate.add(num);
            }
        }

        System.out.println(duplicate);
    }
}
