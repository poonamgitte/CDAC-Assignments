public class Q20_ReverseAString {

    // Using character array
    public static void reverse(char[] str, int f, int l){

        if(f>=l){
            return;
        }

        char temp = str[f];
        str[f] = str[l];
        str[l] = temp;

        reverse(str, f+1, l-1);
    }

    // Using string
    public static String reverseString(String str){

        if(str.isEmpty()){
            return str;
        }

        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        char[] str = "poonam".toCharArray();

        System.out.println(str);
        reverse(str, 0, str.length-1);
        System.out.println(str);

        String str2 = "Gitte";

        System.out.println(str2);
        str2 = reverseString(str2);
        System.out.println(str2);


    }
}
