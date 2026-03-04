// Rotate string leetcode 796

import java.util.*;

public class Q2_Rotate_String {

     static boolean rotateString(String s, String goal){

        if(s.length() != goal.length()) {
            return false;
        }

        int n = s.length();

        for(int i=0; i<n; i++){

            String rotated  = "";
           
            for(int j = 0; j<n; j++){
                rotated += s.charAt((i+j)%n);
            }

            if(rotated.equals(goal)){
                return true;
            }
        }
        return false;
     }

     static boolean rotateString2(String s, String goal){

        if(s.length() != goal.length()) {
            return false;
        }

       return (s+s).contains(goal);
    }

    public static void main(String[] args){
        String s = "abcde", goal = "cdeab";

        System.out.println("Original String:"+s);

        System.out.println("\nGoal String:"+goal);

        if(rotateString2(s,goal)){
            System.out.println("\n Strings are equal");
        }
        else{
             System.out.println("\n Strings are not equal");

        }
    }
}
