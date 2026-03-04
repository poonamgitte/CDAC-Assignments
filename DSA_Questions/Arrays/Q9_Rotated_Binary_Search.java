//Binary search 

//Search target in sorted rotated array

public class Q9_Rotated_Binary_Search {

    public static int search(int nums[], int target, int start, int end){
    
        // int start = 0;
        //int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

     public static int searchTarget(int nums[], int target){

        int pivot = findPivot(nums);

            if(pivot == -1){
                return search(nums,target,0, nums.length-1);
            }
    
            else if (nums[pivot] == target){
                return pivot;
            }
    
            else if( target >nums[0]){
                return search(nums, target,0,pivot-1 );
            }

            else if(target < nums[0])
            {
                return search(nums, target,pivot+1,nums.length-1);

            }
            return pivot;
    }

     public static int findPivot(int nums[]){
        int start =0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end -start)/2;

            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if(mid > start && nums[mid-1] > nums[mid]){
                return mid-1;
            }

            else if ( nums[mid] <= nums[start] ){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    

    public static void main(String[] args) {
        int nums[] = {6,7,8,1,2,3,4,5};
        int target=99;

        System.out.println("Index:"+searchTarget(nums,target));
    }
}
