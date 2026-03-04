// Equilibrium point (gfg)
// Equilibrium point is where prefix Sum of all element before index == suffix sum of all elements after index


public class Q38_EquilibriumIndex {

    public static int findEquilibrium(int arr[]) {
        
        // Approach 1
        // TC - O(n)  SC - O(n)
        // int prefixSum[] = new int[arr.length];
        // int suffixSum[] = new int [arr.length];
        
        // // Calculating prefix Sum
        // prefixSum[0] = arr[0];
        // for(int i=1; i<arr.length; i++){
        //     prefixSum [i] = prefixSum[i-1] + arr[i];
        // }
        
        // suffixSum[arr.length-1] = arr[arr.length-1];
        // for(int i = arr.length-2; i>=0; i--){
        //     suffixSum[i] = suffixSum[i+1]+arr[i];
        // }
        
        // for(int i=0; i<arr.length; i++){
            
        //     int prefix = i == 0 ? 0 : prefixSum[i-1];
        //     int suffix = i == arr.length-1 ? 0 : suffixSum[i+1];
            
        //     if(prefix == suffix){
        //         return i;
        //     }
        // }
        
        // return -1;
        
        
        // Approach 2
        // TC - O(n) SC - O(1)
        
        int prefixSum = 0;
        int total =0;
        
        for(int num : arr){
            total += num;
        }
        
        for(int i=0; i<arr.length; i++){
            int suffixSum = total - prefixSum - arr[i];
            
            if(prefixSum == suffixSum){
                return i;
            }
            
            prefixSum += arr[i];
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1};

        System.out.println("Equilibrium Point = "+ findEquilibrium(arr));
    }
}
