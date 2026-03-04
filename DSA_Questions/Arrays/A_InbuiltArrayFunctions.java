// Inbuilt array functions
import java.util.*;

public class A_InbuiltArrayFunctions {
    public static void main(String[] args) {
       int[] arr = {4,5,2,3,1};

       // 1.Array property
       System.out.println("Length:"+arr.length);

       // 2.Arrays class methods
        Arrays.sort(arr);  // sort array
        System.out.println("Array to String:"+Arrays.toString(arr));

        int[] a1 = {1,2,3};
        int[] a2 = {1,2,3};

        // arr = [1,2,3,4,5] sorted
        System.out.println("Index:"+Arrays.binarySearch(arr, 4));

        System.out.println("Are arrays equal:"+Arrays.equals(a1, a2));  // true or false return 

        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied array:"+Arrays.toString(copy));


        int[] subarr = Arrays.copyOfRange(arr, 1, 3);
        System.out.println("Copied array:"+Arrays.toString(subarr));

        int[] fillArr= new int[5];

        Arrays.fill(fillArr, 10);
        System.out.println("Arrayfiled vith given value:"+Arrays.toString(fillArr));


        // 3.for object arrays (Integer[], String[])

        Integer[] arr2 = {11,22,33,44,55};

        List<Integer> l = Arrays.asList(arr2);

        System.out.println("List:"+l);

    }
}
