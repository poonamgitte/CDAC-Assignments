// Move zeros to end

public class Q28_Move_ZerosToEnd {

     static void display(int[] arr) {
        for (int n : arr) {
            System.err.print(n + " ");
        }
    }

    // Move zeros to end    TC - O(n)  SC - O(1)
    public static void moveZeros(int arr[]){

        int n = arr.length;

        int i=0;

        for(int j=0; j<n;j++){

            if(arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }

        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};

        moveZeros(arr);

        display(arr);

    }
}
