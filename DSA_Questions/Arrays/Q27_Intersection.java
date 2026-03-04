// Intersection of two arrays

import java.util.ArrayList;

public class Q27_Intersection {

    // Approach 1 
    // TC - O(Hl)      Sc- O(1)     
    public static void intersection(int []arr1, int[] arr2){

        int n1 = arr1.length;
        int n2 = arr2.length;

        ArrayList<Integer> set = new ArrayList<>();

        int i=0;
        int j=0;

        while(i<n1 && j<n2){
            
            if(arr1[i] == arr2[j] && (set.isEmpty() || !set.contains(arr1[i]))){
                set.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            // else{
            //     i++;
            //     j++;
            // }

        }

        System.out.println(set);
    }
    public static void main(String[] args) {
        int arr1[] = {1,1,2,3,4,5};
        
        int arr2[] = {2,3,4,4,5,6};


        intersection(arr1, arr2);
    }
}
