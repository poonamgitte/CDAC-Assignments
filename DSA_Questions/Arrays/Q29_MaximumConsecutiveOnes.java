// Find the count of maximum consecutive ones

public class Q29_MaximumConsecutiveOnes {

    // TC - O(n)    sc - (1)
    public static int maxConsecutiveOnes(int arr[]){

        int n = arr.length;

        int cnt = 0;
        int maxCnt = 0;

        for(int i=0; i<n;i++){

            if(arr[i] == 1){
                cnt++;

                maxCnt = Math.max(maxCnt, cnt);
            }
            else{
                cnt =0;
            }
        }
        return maxCnt;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 0,1,1,1,  0, 1};

        System.out.println("Maximum consecutive ones: "+ maxConsecutiveOnes(nums));
    }
}
