// calculate power of a numbber

public class Q5_Power {

    public static int power(int num, int x){
        
        if(x == 0){
            return 1;
        }
        if(num == 0){
            return 0;
        }


        return num * power(num, x-1);
    }

    public static void main(String[] args){

        int num = 0;

        System.out.println("Power:"+power(num,0));
    }

}
