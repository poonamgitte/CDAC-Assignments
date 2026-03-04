
import java.util.ArrayList;

// Subsequences printing using array

public class Q29_Subsequence_Printing {


    // Subsequences by including and excluding character
    public static ArrayList<String> subsequence(String str, String tstr){

        if(str.isEmpty()){
            ArrayList<String > list = new ArrayList<>();
            list.add(tstr);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> left = subsequence(str.substring(1), tstr+ch);
        ArrayList<String> right = subsequence(str.substring(1), tstr);

        left.addAll(right);

        return left;
    }

    // Subsequences with ascii
    public static ArrayList<String> subsequenceAscii(String str, String tstr){

        if(str.isEmpty()){
            ArrayList<String > list = new ArrayList<>();
            list.add(tstr);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> first = subsequenceAscii(str.substring(1), tstr+ch);
        ArrayList<String> second = subsequenceAscii(str.substring(1), tstr);
        ArrayList<String> third = subsequenceAscii(str.substring(1), tstr+(ch+0));


        first.addAll(second);

        first.addAll(third);

        return first;
    }

    public static void main(String[] args) {
        String str = "abc";

        subsequence(str,""); 
        System.out.println("SubSequences:"+subsequence(str, ""));

        System.out.println("Subsequences with ascii :"+subsequenceAscii(str, ""));
    }
}
