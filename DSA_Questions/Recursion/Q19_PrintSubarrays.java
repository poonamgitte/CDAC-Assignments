public class Q19_PrintSubarrays {

    public static void printSubarray(int arr){
        subarray(arr, 0, {});
    }


    public static void subarray(int[]arr, int index, int[] current){

        if(index == arr.length ){
            display(current);
            return;
        }

        subarray(arr, index+1, current);
    }

    public static void display(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        printSubarray(arr);
    }
}
