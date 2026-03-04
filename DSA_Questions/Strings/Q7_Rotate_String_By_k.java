// Rotate string right by k shifts

// String is immutable so we can't make changes in itself 
// Whenever we make changes it will create new object 

public class Q7_Rotate_String_By_k {

    public static void rotateString(StringBuilder str, int k){

        int end = str.length();

        k = k%str.length();
        //str.reverse();
        //or
        reverseStr(str, 0,end);
        reverseStr(str,0,k-1);
        reverseStr(str,k,end);
        
       // return a.toString();  
    } 

    public static void reverseStr(StringBuilder str, int start, int end){

        while(start < end){
            char temp = str.charAt(start);
            str.setCharAt(start, str.charAt(end));
            str.setCharAt(end,temp);
            start++;
            end--;
        }

    }

    public static void main(String[] args){
          StringBuilder str = new StringBuilder("abcdef");
          int k=2;

        System.out.println("Before rotate:"+str); 

        rotateString(str,k);

        System.out.println("\nAfter rotate:"+ str);
    }

}
