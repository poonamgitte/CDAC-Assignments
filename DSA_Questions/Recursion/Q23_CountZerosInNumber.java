// Program to count number of zeros occur

public class Q23_CountZerosInNumber {

    public static int CountZero(int num){

       if(num == 0){
        return 1;
       }

       return helper(num);
    }

    public static int helper(int num){
         if(num == 0){
            return 0;
        }

        if(num%10 == 0){
            return 1 + helper(num/10);
        }

        else{
            return 0 + helper(num/10);
        }
    }
    public static void main(String[] args) {
        int num = 108040;

        System.out.println("No of zeros:"+CountZero(num));
    }
}
