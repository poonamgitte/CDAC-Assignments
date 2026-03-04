// Find top k frequent elements

import java.util.*;


public class Q34_TopK_FrequentElements {

    // TC = O(n) + O(ulogk) + O(ulogk) = O(nlogk)
    // SC = O(n) + O(k) + O(k) = O(n)
    public static int[] topKFrequent(int[] nums, int k){

        int n = nums.length;

        HashMap<Integer, Integer>map = new HashMap<>();

        for(int i=0;i<n;i++){

            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

        }

        Queue<int[]>pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);

        for(int key : map.keySet()){

            pq.add(new int[]{key, map.get(key)});

            if(pq.size() > k){
                pq.poll();
            }
        }

        int result[] = new int[k];

        int i=0;

        while(!pq.isEmpty()){
            result[i++] = pq.poll()[0];
        }

        return result;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,3,4,4,4,4};
        int k=2;

        System.out.println("Frequent elements:" + Arrays.toString(topKFrequent(arr, k)));
    }
}
