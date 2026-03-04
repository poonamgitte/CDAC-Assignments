// Remove character in string using string

public class Q28_RemoveCharacter {

    // TC = O(n)  Sc = O(n)
    public static String removeChar(String str, char ch , int index ){

        if(index == str.length()){
            return "";
        }

        char c = str.charAt(index);

        if( c == ch){
            return removeChar(str, ch, index+1);
        }
        else{

            return c + removeChar(str, ch, index+1);
        }

    }

    // remove perticular substring from string 
    public static String removeString (String str, String subStr){

        if(str.isEmpty()){
            return "";
        }

        char c = str.charAt(0);

        if(str.startsWith(subStr)){
            return removeString(str.substring(subStr.length()), subStr);
        }
        else{
            return c + removeString(str.substring(1), subStr);
        }
    }
    public static void main(String[] args) {
        String str = "shahah";

        System.out.println("Original string :"+str);
        System.out.println("Final String:"+removeChar(str,'a', 0));

        String str2 = "abcapplede";

        System.out.println("Original string :"+str2);
        System.out.println("after removing string:"+removeString(str2, "apple"));
    }
}
