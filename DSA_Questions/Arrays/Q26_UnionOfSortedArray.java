// Union of two sorted arrays

import java.util.*;

public class Q26_UnionOfSortedArray {


    // Approach1  TC- O(mlogm+nlogn)   SC - O(m+n)
    // Set insertion take logn
    public static void union(int[] arr1, int[] arr2){

        HashSet<Integer>set = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }

        for(int num: arr2){
            set.add(num);
        }

        System.out.println(set);
    }

    //Approach2  TC- O(m+n)  Sc-O(m+n) optimal
    public static void union2(int[] arr1, int[] arr2){

        int n1 = arr1.length;
        int n2 = arr2.length;

        int i=0;
        int j=0;

        ArrayList<Integer> list = new ArrayList<>();

        while(i<n1 && j<n2){

            if(arr1[i] <= arr2[j]){

                if(list.isEmpty() || !list.contains(arr1[i])){    
                    list.add(arr1[i]);
                }
                i++;
            }
            else{
                if(list.isEmpty() || !list.contains(arr2[j])){
                    list.add(arr2[j]);
                }
                j++;
            }
        } 

        // remaining arr1 elements
        while(i<n1){

            if(list.isEmpty() || !list.contains(arr1[i])){    
                list.add(arr1[i]);
            }
            i++;
        }

        //Remaining arr2 elements
        while(j<n2){
            if(list.isEmpty() || !list.contains(arr2[j])){
                    list.add(arr2[j]);
            }
            j++;
        }

        System.out.println(list);
    }

    public static void display(int[] arr){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        int arr1[] = {1,1,2,3,4,5};
        
        int arr2[] = {2,3,4,4,5,6};

        union(arr1, arr2);

        union(arr1, arr2);

    }
}
