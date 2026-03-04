public class KadaneAlgorithm {

    static int prefixSum(int nums[]){

        int maxSum = Integer.MIN_VALUE;
        int currentSum=0 ;

        int prefixSum[] = new int[nums.length];

        prefixSum[0] = nums[0];

        for(int i=1; i<nums.length;i++){

            prefixSum[i] = prefixSum[i-1] + nums[i];
        }


        for(int i=0; i<nums.length;i++){

            currentSum =0;

            for(int j=i+1; j<nums.length;j++){

                currentSum = (i == 0)? prefixSum[0] : prefixSum[j] -prefixSum[i-1]; 
                maxSum = Math.max(maxSum, currentSum);
            }
            
        }

        return maxSum;

    }

    static int kadanes(int nums[]){

        int maxSum= Integer.MIN_VALUE;
        int cs=0;

        int flag =1;
        for(int i=0; i<nums.length;i++){
            if(nums[i]>0){
                flag = 0;
                break;
            }
        }

        if(flag == 1){

            // give max sum for array including all -ve numbers
            for(int i=0; i<nums.length;i++){
                maxSum = Math.max(maxSum,nums[i]);
            } 
        }
        else{
            for(int i=0; i<nums.length;i++){

                cs = cs + nums[i];


                if(cs < 0){
                    cs = 0;
                }

                maxSum = Math.max(cs,maxSum);
            }
        }
            
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        System.err.println("Max subarray sum :"+kadanes(arr));

        System.err.println("Max subarray sum :"+prefixSum(arr));

    }
}
