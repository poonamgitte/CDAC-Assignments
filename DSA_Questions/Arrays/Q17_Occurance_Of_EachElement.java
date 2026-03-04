//Counting frequency of elements

import java.util.HashMap;

public class Q17_Occurance_Of_EachElement {
    public static void main(String[] args) {
        int arr[] = {1,4,5,2,3,4,1,5,4,2};

        HashMap<Integer,Integer>map = new HashMap<>();

        for(int num : arr){

            map.put(num, map.getOrDefault(num,0)+1);
        }

        System.out.println("Occurance of each element: ");

        for(int key : map.keySet()){
            System.out.println(key+"->"+map.get(key));
        }
    }
}
