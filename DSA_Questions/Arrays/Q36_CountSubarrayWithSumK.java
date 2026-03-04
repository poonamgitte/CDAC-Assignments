// Count of all subarray with sum k

public class Q36_CountSubarrayWithSumK {

    // Only work for +ve numbers
    
     public static int subarraySum(int[] nums, int k) {

        int n = nums.length;

        int sum = 0;
        int start = 0;
        int count = 0;

        for(int i=0; i<n; i++){

            sum += nums[i];

            while(sum > k && start <= i){
                sum -= nums[start];
                start++;
            }

            if(sum == k && start <= i){
                count++;
            }
        }

        return count;
     }
    public static void main(String[] args) {
        int arr[] = {1,1,1};
        int k = 2;

        System.out.println("Total subarray with sum k :"+ subarraySum(arr, k));

    }
}
