public class Q21_Check_IsStringPalindrome {

    public static boolean isPalindrome(char [] str, int start,int end){

        if(start >= end){
            return true;
        }

        if(str[start] != str[end]){
            return false;
        }

        return isPalindrome(str, start+1, end-1);
    }
   public static void main(String[] args) {
        char [] str = "abcba".toCharArray();

        System.out.println(" is string palindrome:"+ isPalindrome(str, 0,str.length-1));
   } 
}
