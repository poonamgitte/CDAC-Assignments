// Reverse the words in a string

public class Q12_Reverse_Words_In_String {
    public static void main(String[] args) {
        
        String str = "This is the world";

        String arr[] = str.split("\\s+");   // For more than one stace in between two words  "\\s+" instead of " " 

        int start =0;
        int end = arr.length-1;

        while(start < end){
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Joining splited string
        String reverse = String.join( " ",arr);

        System.out.println(reverse);
    }
}
