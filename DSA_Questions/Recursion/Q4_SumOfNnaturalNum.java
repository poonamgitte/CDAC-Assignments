// Sum of first n natural numbers using recursion

public class Q4_SumOfNnaturalNum {

    // Function to calculate sum of n natural nums
    public static int sum(int n){

        if (n == 0){
            return 0;
        }

        return (int)Math.pow(n, 3) + sum(n-1);
    }

    public static void main(String[] args) {
        int n = 3;

        System.out.println("Sum:"+sum(n));
    }
}
