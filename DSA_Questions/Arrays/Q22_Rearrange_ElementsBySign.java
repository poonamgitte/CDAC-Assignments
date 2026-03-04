// rearrange array elements by sign

import java.util.*;

public class Q22_Rearrange_ElementsBySign {


    // TC-O(2n) SC O(n)
    public static void reArrange(int nums[]){

        List<Integer> pos = new ArrayList<>();

        List<Integer> neg = new ArrayList<>();


        
        for(int i=0; i<nums.length; i++){
            
            if(nums[i] < 0){
                neg.add(nums[i]);
            }
            else{
                pos.add(nums[i]);
            }
        }
        
        int n1 = pos.size();
        int n2 = neg.size();

        int i=0;
        int j=0;

        int k = 0;

        while(i<n1 && j< n2){

            nums[k++] = pos.get(i++);
            nums[k++] = neg.get(j++);
        }

        while(i<n1){
            nums[k++] = pos.get(i++);
        }

        while(j<n2){
            nums[k++] = neg.get(j++);

        }

       
    }

    // Optimal   TC- O(n)  SC= O(1)
    // Only work for same no of positive and negative 
    public static void reArrang2(int nums[]){

        int  pos = 0;
        int neg = 1;

        int result[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){

            if(nums[i] <0){
                result[neg] = nums[i];
                neg = neg + 2;

            }
            else{
                result[pos] = nums[i];
                pos = pos+2;
            }
        }

        for(int i=0; i<result.length;i++){

            System.out.print(result[i]+ " ");
        }

    }
    
     public static void display(int[] arr) {
        for (int n : arr) {
            System.err.print(n + " ");
        }
    }


    public static void main(String[] args) {
        int nums[] = {3,1,-2,-5,2,-4};

        //reArrange(nums);

        reArrang2(nums);
       // display(nums);

    }

    // public static int[] rearrangeElement(int nums[]){

    // //     List<Integer>pos = new ArrayList<>();
    // //     List<Integer>neg = new ArrayList<>();

    // //     for(int i=0; i<nums.length;i++){

    // //         if(nums[i]>0){
    // //             pos.add(nums[i]);
    // //         }
    // //         else{

    // //             neg.add(nums[i]);
    // //         }

    // //     }
    // //    int result[] = new int[nums.length];
    // //     int iTemp=0;
    // //     for(int p=0; p <pos.size();p++){
    // //         result[iTemp++] = pos.get(p);
    // //         result[iTemp++] = neg.get(p);
    // //     }

    // //     for(int num: result){
    // //         System.out.print(num+" ");
    // //     }


    // }
    // }
    // public static void main(String[] args) {
    //     int nums[] = {3,1,-2,-5,2,-4};
    //     //int nums[] = {-1,1};
    //    // int n = nums.length;

    //     // int i=0; 
    //     // int j=1;

    //     // while(i<n && j<n){
    //     //     if(nums[i] > 0){
    //     //         i += 2;
    //     //     }
    //     //     else if(nums[j] < 0){
    //     //         j +=2;
    //     //     }
    //     //     else{
    //     //         int temp = nums[i];
    //     //         nums[i] = nums[j];
    //     //         nums[j] = temp;
    //     //         i+=2;
    //     //         j+=2;
    //     //     }
    //     // }

    //     // for(int num: nums){
    //     //     System.out.print(num+" ");
    //     // }

    // }

   
}
