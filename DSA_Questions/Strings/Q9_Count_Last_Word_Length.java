// Count length of last wordmin string

public class Q9_Count_Last_Word_Length {

    public static int countLength(String str){

        // time  complext
        // String arr[] = str.split(" ");

        // int last = arr.length-1; // index of last word
        // return arr[last].length();

        // O(n) and O(1 )space 

        int n= str.length()-1;

        while (n >=0 && str.charAt(n)== ' '){
            n--;

        }

        int length=0;
        while (n>=0 && str.charAt(n) != ' '){
            length++;
            n--;
        }
        return length;
    }
    public static void main(String[] args){
        String str = "Hi I am Poonam   ";

        System.out.println("Last word length:"+countLength(str));
    }
}

