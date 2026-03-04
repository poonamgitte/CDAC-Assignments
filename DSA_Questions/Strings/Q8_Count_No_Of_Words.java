// Count no of words in string

public class Q8_Count_No_Of_Words {

    public static int countWords(String str){

        String arr[] = str.split(" ");

        return arr.length;
    }
    public static void main(String[] args){
        String str = "Hi I am Poonam";

        System.out.println("Count of words:"+countWords(str));
    }
}
