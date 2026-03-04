// Prefix sum method to calculate sum of subarrays
//Time complexity O(n2) ----> not bad
public class PrefixSubArray{

    static void subArraySum(int arr[]){

        int min_sum = Integer.MAX_VALUE;
        int max_sum = Integer.MIN_VALUE;
        int currsum;

        int prefixSum[] = new int[arr.length];

        prefixSum[0] = arr[0];

        for(int i=1; i<arr.length; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        for(int i=0; i<arr.length;i++){
            int start = i;
            currsum = 0;
            for(int j= i+1;j<arr.length;j++){
                int end = j;
                currsum = start==0 ? prefixSum[0] : prefixSum[end]-prefixSum[start-1];
            }

            if(currsum > max_sum){
                max_sum = currsum;
            }

            if(currsum < min_sum){
                min_sum = currsum;
            }

        }

        System.out.println("Max sum:"+max_sum);
        System.err.println("Min Sum:"+min_sum);
    }

    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        //int n = arr.length;


        System.out.println("SubArray sum:");
        subArraySum(arr);
    }
}