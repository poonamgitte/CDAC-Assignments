
import java.lang.reflect.Array;
import java.util.*;

public class Q26_Subsets_Of_Array {

    // Time complexity = O(n * 2^n)  SC = O(n*2^n)
    public static ArrayList<ArrayList<Integer>> subsets(int[] arr){

        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>()); // adding first empty list

        for(int num: arr){
            int size = outer.size();

            for(int i=0; i<size; i++){

                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));

                inner.add(num);

                outer.add(inner);
            }
        }

        return outer;
    }

    // Subsets of array with duplicate values in array
    // to get all unique subsets
    public static ArrayList<ArrayList<Integer>> subsetsWithDuplicate(int[] arr){

        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>()); // adding first empty list

        int start = 0, end = 0;


        for(int i = 0 ; i<arr.length; i++){
            start = 0;

            if(i>0 && arr[i] == arr[i-1]){
                start = end + 1;
            }

            end = outer.size()-1;

            int size = outer.size();

            for(int j = start; j < size; j++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));

                inner.add(arr[i]);

                outer.add(inner);
            }
        }


        return outer;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println("All subsets : "+subsets(arr));

        int arrDup[] = {1,2,2};

        System.out.println("All Subsets: "+subsetsWithDuplicate(arrDup));
    }
}
