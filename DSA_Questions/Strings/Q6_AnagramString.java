// check anageram strings
// anagram strings made by rearrangement of other

import java.util.*;

public class Q6_AnagramString {

    public static boolean anagram(String s, String t){


        // O(n log n) 

        // char sArr[] = s.toCharArray();
        // char tArr[] = t.toCharArray();

        // Arrays.sort(sArr);
        // Arrays.sort(tArr);

        // return Arrays.equals(sArr, tArr);


        // O(n)

        // if( s.length() != t.length()) 
        //     return false;

        // HashMap<Character,Integer>freq = new HashMap<>();

        // for(char c : s.toCharArray()){

        //     freq.put(c,freq.getOrDefault(c, 0)+1);
        // }

        // for(char c : t.toCharArray()){

        //     if(! freq.containsKey(c))
        //         return false;

        //     freq.put(c,freq.get(c)-1);

        //     if(freq.get(c) == 0){
        //         freq.remove(c);
        //     }
            
        // }

        // return freq.isEmpty();

        if(s.length() != t.length()){
            return false;
        }

        Map<Character,Integer>freq = new HashMap<>();

        for(char c: s.toCharArray()){
            freq.put(c,freq.getOrDefault(c, 0)+1);
        }

        for(char c: t.toCharArray()){
            if(! freq.containsKey(c)){
                return false;
            }

            freq.put(c,freq.get(c)-1);

            if(freq.get(c) == 0){
                freq.remove(c);
            }
        }
        return freq.isEmpty();
    }
    public static void main(String[] args) {
        
        String s = "listen";
        String t = "silent";

        System.out.println("Is Anagram: "+anagram(s, t));
    }
}
