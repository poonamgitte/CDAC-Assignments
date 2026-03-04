// Remove outer paranthesis of string

public class Q13_RemoveOuterParanthesis {

    public static String removeOuterParantheses(String s){

        int cnt = 0;

        StringBuffer sb = new StringBuffer();

        for(int i=0; i<s.length();i++){

            char ch = s.charAt(i);
            if(ch == '('){

                if(cnt > 0){
                    sb.append(ch);
                }
                cnt++;
            }
            else{
                cnt--;

                if(cnt > 0){
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "(()())(())";

        System.out.println("Old string : "+str);
        System.out.println("New String : "+ removeOuterParantheses(str));

    }
}
