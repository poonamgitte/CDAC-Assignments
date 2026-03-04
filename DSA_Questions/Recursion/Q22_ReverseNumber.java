// reverse the number using recursion

public class Q22_ReverseNumber {

    public static int reverseNum(int num){

        return helper(num, 0);
    }

    public static int helper(int num, int rev){

        if(num == 0){
            return rev;
        }

        int digit = num%10;

        rev = rev*10 + digit;

        return helper(num/10, rev);
    }
    public static void main(String[] args) {
        
        int num = 12343;

        System.out.println(reverseNum(num));
    }
}
