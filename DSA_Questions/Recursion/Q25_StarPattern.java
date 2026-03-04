
public class Q25_StarPattern{


    // using two methods (more function overhead)
    public static void printF1(int n){
        if(n ==0 ){
            return;
        }

        printF2(n);

        System.out.println();

        printF1(n-1);
    }

    public static void printF2(int n){

        if(n ==0){
            return;
        }

        System.out.print("*");

        printF2(n-1);
    }


    //Approach 2 (using only one function)

    public static void printPattern(int row, int col){

        if(row == 0){
            return ;
        }

        if(col<row){
            System.out.print("*");
            printPattern(row, col+1);
        }
        else{
            System.out.println();
            printPattern(row-1, 0);
        }
    }


    public static void main(String[] args) {
        
        // Print star pattern 
        printF1(4);

        int row = 4;

        printPattern(row, 0);
    }
}