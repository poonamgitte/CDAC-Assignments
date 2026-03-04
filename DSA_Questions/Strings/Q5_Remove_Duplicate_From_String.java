//remove duplicate elements from string

import java.util.*;


public class Q5_Remove_Duplicate_From_String {

    public static String removeDuplicate(String str){

        HashSet<Character>freq =new HashSet<>();
        StringBuilder result = new StringBuilder();

        for(char c: str.toCharArray()){

            if(!freq.contains(c)){
                freq.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        
        String str = "indians";

        System.out.println(removeDuplicate(str));
    }
}
