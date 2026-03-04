public class Q15_Check_IsArrayPalindrome {

    public static boolean isPalindrome(int[] arr, int f, int l){

        if(f >= l){
            return true;
        }

        if(arr[f] != arr[l]){
            return false;
        }

        return isPalindrome(arr, f+1, l-1);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,1};

        System.out.println("Is palindrome:"+isPalindrome(arr, 0, arr.length-1));
    }
}
