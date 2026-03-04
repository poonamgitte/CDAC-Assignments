public class Q4_MergeSort {

    // public static void mergeSort(int arr[], int left, int right){

    //     if(left >= right) {
    //         return;
    //     }

    //     int mid = (left +right)/2;
    //     mergeSort(arr, left, mid);
    //     mergeSort(arr, mid+1, right);
    //     merge(arr, left, mid, right);
    // }

    // public static void merge(int[] arr, int left, int mid, int right){

    //     // Size of divided sections
    //     int n1 = mid - left + 1;
    //     int n2 = right - mid;

    //     // New arrays to store divided array and sort

    //     int arr1[] = new int[n1];
    //     int arr2[] = new int[n2];

    //     for(int i=0; i<n1; i++){
    //         arr1[i] = arr[left+i];
    //     }
        

    //    for(int j=0; j<n2; j++){
    //         arr2[j] = arr[mid+1+j];
    //     }

    //     int i = 0;
    //     int j = 0;

    //     int k = left;
    //     while(i < n1 && j < n2 ){

    //         if(arr1[i] < arr2[j]){
    //             arr[k++] = arr1[i++];
    //         }
    //         else{
    //             arr[k++] = arr2[j++];
    //         }
    //     }

    //     while(i<n1){
    //         arr[k++] = arr1[i++];
    //     }

    //     while(j<n2){
    //         arr[k++] = arr2[j++];
    //     }
    // }

    public static void mergeSort(int[] arr, int left, int right){

        if(left >= right){
            return;
        }

        int mid = (left + right)/2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right){

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0; i<n1;i++){
            L[i] = arr[left+i];
        }

        for(int i =0 ; i<n2; i++){
            R[i] = arr[mid+1+i];
        }

        int i=0;
        int j=0;
        int k=left;

        while(i<n1 && j<n2){

            if(L[i] < R[j]){
                arr[k++] = L[i++];
            }
            else{
                arr[k++] = R[j++];
            }
        }

        while(i<n1){
            arr[k++] = L[i++];
        }

        while(j<n2){
            arr[k++] = R[j++];
        }

    }

    static void display(int nums[]){

        for(int i =0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = {2,4,6,1,7,9,8};

        System.out.println("Array before sort:");
        display(nums);

        mergeSort(nums, 0, 6);

        System.out.println("Array After sort:");
        display(nums);   
    }
}
