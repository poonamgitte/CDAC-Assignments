import java.util.*;

public class Q25_ConsitiveSequence {
    public static void main(String[] args) {
        
        int arr[] = {4,2,1,5,6,12,23,22};


        HashSet<Integer> set = new HashSet<>();

        int longest = 0;

        for(int num:arr){
            set.add(num);
        }

        System.out.println(set);

        for(int num :set){

            if(!set.contains(num-1)){
                int current = num;
                int length = 1;

                while(set.contains(current+1)){
                    current++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        System.out.println("Longest sequence count:"+longest);
    }
}
