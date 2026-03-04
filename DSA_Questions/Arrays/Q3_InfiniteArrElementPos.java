//Binary search

//Q Find the position of element in sorted infinite array
// Solving the problem by taking chunks of array

public class Q3_InfiniteArrElementPos {

    static int searchPosition(int nums[], int target){

        //initially 2 size array chunk selected
        int start = 0;
        int end = 1;

        while(target > nums[end]){
            int newStart = end + 1;

            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(nums,target, start, end);
    }

    static int binarySearch(int nums[], int target, int start, int end){

            while(start<=end){
                int mid = start + (end-start)/2;

                if(target <nums[mid]){
                    end = mid -1;
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
    
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,7,8,9,10,11,12,13,14,16,17,19,20,22,23,24,26,27,28,29,30,34,35,36,38};

        int target = 12;

        System.out.println("Position of element:"+searchPosition(arr,target));
    }
}
