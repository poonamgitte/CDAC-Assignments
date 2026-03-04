// Binary search

public class BinarySearch {
    static int binarySearch(int nums[],int target){

        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < nums[mid]){
                end = mid -1;
            }
            else if(target > nums[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {2,4,6,1,7,9,8};
        int target=7;

        System.out.println("Index:"+binarySearch(nums,target));
    }
}
