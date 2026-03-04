// 75 Dutch national flag

public class Q18_Dutch_National_Flag {

    public static void dutchNationalFlag(int[] nums){

        int low =0;
        int high = nums.length-1;

        int mid =0;

        // O(n)
        while(mid <= high){

            // if 0 put at start
            if(nums[mid] == 0){
                int temp= nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }

            // if 1 move without update
            else if(nums[mid] ==1){
                mid++;
            }

            // if 2 put at end
            else if(nums[mid ] == 2){
                 int temp= nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    
    
    public static void main(String[] args) {
        
        int nums[] = {2,1,0,0,1,0,2,1};

        System.out.println("Array before sort");
        for(int num:nums){
            System.out.print(num+" ");
        }

        dutchNationalFlag(nums);

        System.out.println("Array after");
        for(int num:nums){
            System.out.print(num+" ");
        }

    }
}
