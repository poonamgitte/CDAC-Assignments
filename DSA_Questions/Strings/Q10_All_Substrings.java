// All substrings of a given string

public class Q10_All_Substrings {
    public static void main(String [] args){
        String str = "abc";

        //Manual approach o(n^3)
        for(int i=0; i<str.length();i++){
            for(int j=i; j<str.length();j++){
                for(int k=i; k<=j;k++){
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }

        // O(n^2)
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
