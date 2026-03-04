// Binary search 

// Find element in mountain array and return minimum index 
// if not found return -1


public class Q8Find_Target_In_Mountain {

    static int findTarget(int nums[], int target){

        int start = 0;
        int end = nums.length-1;
        int peak =  findPeak( nums);  // greatest num divide increasing and decreasing array

        int result;

        result = search(nums, start, peak, target);

        if(result == -1){
            result = search(nums, peak, end, target);
        }

        return result;
    }

    //Find peak of mountain array
    static int findPeak(int nums[]){
        int start = 0;
        int end = nums.length-1;

        while(start != end){

            int mid = start + (end-start)/2; 

           
            if(nums[mid] < nums[mid+1]){
                start = mid + 1;
            }
            else  if(nums[mid] > nums[mid + 1]){
                end = mid;
            }
        }
        return start;
    }

    static int search(int nums[], int start, int end, int target){

        int mid = start +(end-start)/2;

        while(start <= end){
            if(target < nums[mid]){
            end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
         int nums[] = {1,2,3,5,6,3,2};
         int target = 3;

         int index = findTarget(nums, target);

        if (index != -1)
            System.out.println("Index:" + index);
        else
            System.out.println("Element not found");

    }
}
