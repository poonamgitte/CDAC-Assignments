//Binary search

//Q4 Find the mountain peak that is max element in array where first half is ascending 2nd half is descending 
// eg arr= [1,2,3,4,6,5,3,2,1]     o/p : 6

//  Bitonic array
 
public class Q4_MountainPeak {

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
        return nums[start];

    }


    public static void main(String args[]){
        int nums[] = {1,2,3,5,6,3,2};

        System.out.println("Peak element:"+findPeak(nums));
    }
}
