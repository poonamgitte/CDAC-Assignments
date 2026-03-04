// Finding the nth fibonacci
// fibonacci series :  0 1 1 2 3 5 8 13

public class Q6_Nth_Fibonacci {

    public static int fibonacci(int n){

        // Base cases
        if(n == 0){
            return 0;
        }

        if(n ==1){
            return 1;
        }

        // to find next term
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args){

        int n= 7;

        System.out.println("Nth Fibonacci:"+fibonacci(n));
    }
}
