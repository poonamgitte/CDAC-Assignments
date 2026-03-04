public class Q3_InsertionSort {

    public static void insertionSort(int arr[]){

        int n = arr.length-1;

        for(int i=1; i<n; i++){

            int j = i-1;
            int temp = arr[i];

            while(j >= 0){

                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                    j--;
                }
                else{
                    break;
                }
            }

            arr[j+1] = temp;
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

        insertionSort(nums);

        System.out.println("Array After sort:");
        display(nums);   
    }
}
