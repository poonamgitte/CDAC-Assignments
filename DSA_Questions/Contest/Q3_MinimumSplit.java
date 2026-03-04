// You are given an integer array nums of length n.

// Choose an index i such that 0 <= i < n - 1.

// For a chosen split index i:

// Let prefixSum(i) be the sum of nums[0] + nums[1] + ... + nums[i].
// Let suffixMin(i) be the minimum value among nums[i + 1], nums[i + 2], ..., nums[n - 1].
// The score of a split at index i is defined as:

// score(i) = prefixSum(i) - suffixMin(i)

// Return an integer denoting the maximum score over all valid split indices.

//  

// Example 1:

// Input: nums = [10,-1,3,-4,-5]

// Output: 17

// Explanation:

// The optimal split is at i = 2, score(2) = prefixSum(2) - suffixMin(2) = (10 + (-1) + 3) - (-5) = 17.©leetcode



public class Q3_MinimumSplit {

    public static long maximumScore(int[] nums) {

        int n = nums.length;
        int suffixMin[] = new int[n];

        suffixMin[n-1] = nums[n-1];

        for(int i=n-2; i>=0; i--){
            suffixMin[i] = Math.min(suffixMin[i+1], nums[i]);
        }


        long prefixSum = 0;
        long maxScore = Integer.MIN_VALUE;
        
        for(int i=0; i<n-1;i++){
            prefixSum += nums[i];
            long score = prefixSum-suffixMin[i+1];
            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }

    public static void main(String[] args) {
        
        int nums[] = {10,-1,3,-4,-5};

        System.out.println("Max score of split:"+maximumScore(nums));
    }
}
