public class Q7_FibonacciSeries {

    public static void printFibonacci(int n, int t1, int t2, int count){

        if(count == n){
            return;
        }

        System.out.println(t1+" ");

        printFibonacci(n, t2, t1+t2, count+1);
    }

    public static void main(String[] args) {
        int n = 7;

        printFibonacci(n, 0, 1, 0);
    }
}
