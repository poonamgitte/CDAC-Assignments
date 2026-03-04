

public class Q14_Sum_To_NonZero_int {
    public static void main(String[] args) {
        int num = 11;

        for(int A=1; A<num; A++){
            int B = num-A;

            String strA = String.valueOf(A);
            String strB = String.valueOf(B);

            if(!strA.contains("0") && !strB.contains("0")){
                System.out.println(A+" "+B);
                break;
            }
        }
    }
}
