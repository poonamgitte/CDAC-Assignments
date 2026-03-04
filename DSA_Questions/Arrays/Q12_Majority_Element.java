
import java.util.HashMap;

// leetcode 169 majority element occur more than n/2 times

public class Q12_Majority_Element {
    public static void main(String[] args) {
        int arr[] = {1,3,2,1,4,1,1};

        int n = arr.length;
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num: arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        for(int key:freq.keySet()){

            if(freq.get(key) > n/2){
                System.out.println(key);
            }
        }
    }
}
