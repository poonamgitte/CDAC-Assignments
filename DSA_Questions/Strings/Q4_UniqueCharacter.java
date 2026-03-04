
import java.util.HashMap;

// find first unique character in string

public class Q4_UniqueCharacter {

    static int uniqueChar(String str){
        // Map <Character, Integer> freq = new HashMap<>();

        // for(char c : str.toCharArray()){
        //     freq.put(c, freq.getOrDefault(c,0)+1);
        // }

        // for(int i = 0; i< str.length();i++){

        //     if(freq.get(str.charAt(i)) == 1){
        //         return i;
        //     }

        // }
        // return -1;

        HashMap<Character, Integer>freq = new HashMap<>();

        for(char c: str.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        for( int i=0; i<str.length(); i++){

            if(freq.get(str.charAt(i)) ==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "indianda";

        System.out.println("Unique Character Index:"+uniqueChar(str));

    }
}
