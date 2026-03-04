// Print n to 1 using recursion

public class Q2_Print_NTo1 {

    public static void print(int n){

        if(n == 0){
            return;
        }

        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        int n=10;

        print(n);
    }
}
