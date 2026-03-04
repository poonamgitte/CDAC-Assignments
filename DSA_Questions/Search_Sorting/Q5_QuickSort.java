public class Q5_QuickSort {

    public static void quickSort(int[] arr, int left, int right){

        if(left < right){

            int pivot = partition(arr,left,right);
            quickSort(arr, left, pivot-1);
            quickSort(arr, pivot+1, right);
        }
    }

    private static int partition(int[] arr, int low, int high){

        int pivot = arr[low];

        int left = low;
        int right = high;
        
        while(left < right){

            while(arr[left] <= pivot && left <high){
                left++;
            }

            while(arr[right] > pivot && right >low){
                right--;
            }

            if(left < right){
                swap(arr, left, right);
            }
        }

        arr[low] = arr[right];
        arr[right] = pivot;

        return right;
    }

    private static void swap(int[] arr, int left, int right)
    {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
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

        quickSort(nums, 0, 6);
        System.out.println("Array After sort:");
        display(nums);   
    }
}
