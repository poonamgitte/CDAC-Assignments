// Print 1 to n using recursion

public class Q1_Print_1ToN{

    // recursive function
    public static void print(int n){

        if(n == 0){     // Base case
            return;
        }

        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 10;

        print(n);
    }
}