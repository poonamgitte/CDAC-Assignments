// Return multiple occurences of a element
import java.util.*;

public class Q24_OccurencesOfElement {

    public static List<Integer> multipleOccurences(int [] nums, int target){

        List<Integer>list = new ArrayList<>();

        return helper(nums, list, 0, target);
    }

    public static List<Integer> helper(int[] nums, List<Integer>list, int n,int target){

        if(n == nums.length){
            return list;
        }

        if(nums[n] == target ){
            list.add(n);
        }

        return helper(nums, list, n+1, target);
    }
    public static void main(String[] args) {
        int [] nums = {10,20,10,30,40,10};

        List<Integer>list = multipleOccurences(nums, 10);

        System.out.println("All Occurences :" + list );
    }
}
