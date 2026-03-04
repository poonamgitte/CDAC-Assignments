//Binary search

// Find first and last index of element in sorted array



public class Q7First_And_Last_Index {

    static int[] Index_Of_Arr(int nums[], int target){

        int index[] = {-1,-1};
        boolean findFirstIndex;

        index[0] = search(nums, target, findFirstIndex=true );

        if(index[0] != -1){
            index[1] = search(nums, target, findFirstIndex=false );
        }
        return index;
    }

    static int search(int nums[], int target, boolean findFirstIndex){

        int ans = -1;
    
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                ans = mid;

                if(findFirstIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int nums[] = {1,2,3,4,4,5,5,5,6,7,8};
        int target = 5;

        int index[] = Index_Of_Arr(nums,target);

        System.err.println("First and last index : "+index[0]+ " , "+index[1]);
    }
}
