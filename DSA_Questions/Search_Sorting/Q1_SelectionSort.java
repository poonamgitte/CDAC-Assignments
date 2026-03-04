//Selection sort

public class Q1_SelectionSort {
    static void selectionSort(int nums[]){

        int minindex=0;
        int n=nums.length;

        for(int i=0;i<n-1;i++){

            for(int j=i+1; j<n; j++){

                if(nums[i] > nums[j]){
                    minindex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minindex];
            nums[minindex] = temp; 
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

        selectionSort(nums);
        System.out.println("Array After sort:");
        display(nums);   
     }
}
