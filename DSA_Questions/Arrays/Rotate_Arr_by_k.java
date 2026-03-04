// Right rotate by k position
// using temp array temp[(i+k)%n] = arr[i]; 

// In place solution
public class Rotate_Arr_by_k {
    static void display(int[] arr) {
        for (int n : arr) {
            System.err.print(n + " ");
        }
    }

    static void reverse(int[] arr, int left, int right) {
        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Right rotate array by k   TC- O(n + n/2)  SC - O(1)
    static void rotateRight(int[] arr, int k) {

        int left = 0;
        int right = arr.length - 1;

        reverse(arr, left, right);
        reverse(arr, 0, k-1);
        reverse(arr, k, right);
    }


    // Left rotate array by k       TC- O(n + n/2)  SC - O(1)
    static void rotateLeft(int[] arr, int k){

        int left = 0;
        int right = arr.length -1;

        reverse(arr, 0, k-1);
        reverse(arr, k, right);
        reverse(arr, left, right);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int k = 2;

        rotateRight(arr, k);

       // rotateLeft(arr, k);
        display(arr);

    }
}
