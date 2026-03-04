// Reverse array using recursion

public class Q14_ReverseArray {

    public static void reverseArray(int [] arr, int f, int l){

        if(f >= l){
            return;
        }

        swap(arr,f,l);

        reverseArray(arr, f+1, l-1);
    }

    public static void swap(int[]arr, int f,int l){

        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }

    public static void display(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        System.out.println("Before reverse");
        display(arr);
        reverseArray(arr,0, arr.length-1);

        System.out.println("After reverse");
        display(arr);

    }
}
