// Valid parenthesis

import java.util.Stack;

public class Q1_ValidParenthesis {

    public static boolean isValidParenthesis(String str){

        if(str == null){
            return true;
        }

        Stack<Character> stack = new Stack<>();

        int i=0 ;
        while(i<=str.length()/2){

            if(str.charAt(i) == '(')
                stack.push(')');
            else if(str.charAt(i) == '[')
                stack.push(']');
            else if(str.charAt(i) == '{')
                stack.push('}');
                
            i++;
        }

        while(i<str.length()){

            if(stack.peek() == str.charAt(i)){
                stack.pop();
            }
            else{
                return false;
            }
            i++;
        }

        return true;
    }
    
    public static void main(String[] args) {
        
        String str = "({[()]})";

        System.out.println("Are valid parenthesis:"+isValidParenthesis(str));
    }
}
