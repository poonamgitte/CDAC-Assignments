// intersection of two arrays
import java.util.*;


public class IntersectionOfArrs {
    public static void main(String[] args) {
        int nums1[] = {1,3,2,2};
        int nums2[] = {2,1};

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int m = nums1.length;
        int n = nums2.length;

        int p1=0;
        int p2=0;

        HashSet<Integer>intersection = new HashSet<>();

        while(p1<m && p2<n){

            if(nums1[p1] == nums2[p2]){
                intersection.add(nums1[p1]);
                p1++;
                p2++;
            }
            else if(nums1[p1] < nums2[p2]){
                p1++;
            }
            else{
                p2++;
            }
        }

        int k = intersection.size();

        // int result[] = new int[k];
        // int cnt=0;

        // for(int num: intersection){
        //     result[cnt++] = num;
        // }

        
        for(int num: intersection){
           System.out.println(num+" ");
         }

    }
}
