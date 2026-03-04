// Linear search

public class Linear_Search{

    static int linearSearch(int nums[],int target){

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {2,4,6,1,7,9,8};
        int target=7;

        System.out.println("Index:"+linearSearch(nums,target));
    }
}

