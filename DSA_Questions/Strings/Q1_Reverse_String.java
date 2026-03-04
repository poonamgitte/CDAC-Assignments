// Reverse the string leetcode 344

public class Q1_Reverse_String {
    
    static void reverseString(char[] s){

       int start = 0;
       int end = s.length-1;

       while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
       }

    }

    static void display(char[] s){

        for(char c : s){
            System.err.print(c);
        }
    }
    public static void main(String[] args){
        char str[] = {'a','b','c','d','e'};

        System.out.println("Before reverse:");
        display(str);

        reverseString(str);

        System.out.println("\nAfter reverse:");
        display(str);
    }
}
