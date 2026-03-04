// Bubble sort

public class Q2_BubbleSort {
    static void bubbleSort(int nums[]){

        int n=nums.length;
        
        for(int i=0;i<n-1;i++){
            
            int cnt=0;
            for(int j=0; j<n-1-i; j++){

                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp; 
                    cnt++;
                }
            }

            // This will check if already sorted array then break loop
            if(cnt == 0){
                break;
            }

            
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

        bubbleSort(nums);
        System.out.println("Array After sort:");
        display(nums);   
     }
}
