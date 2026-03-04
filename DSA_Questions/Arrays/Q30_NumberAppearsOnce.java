// Find number appears once and other appears twice

import java.util.HashMap;

public class Q30_NumberAppearsOnce {

    // Bruteforce           TC - O(n^2)  SC - O(1)
    public static int uniqueNum(int[] arr){

        int n =arr.length;

        for(int i = 0;i<n;i++){

            int cnt = 0;
            for(int j =0; j<n; j++){

                if(arr[i] == arr[j]){
                    cnt++;
                }
            }

            if(cnt == 1){
                return arr[i];
            }
        }

        return -1;
    }


    // Better solution      TC - O(2n)  SC - O(n)
    public static int uniqueNum2(int arr[]){

        HashMap<Integer, Integer>map = new HashMap<>();

        for(int i=0; i<arr.length; i++){

            //  add elements in map with count
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);     
        }

        for(int i=0; i<arr.length;i++){

            if(map.get(arr[i]) == 1){
                return arr[i];
            }
        }
        return -1;
    }

    // Optimal solution using XOR       TC- O(n)  SC- O(1)
    public static int uniqueNum3(int arr[]){

        int num = 0;

        for(int i=0; i<arr.length;i++){
            num = num ^ arr[i];
        }

        return num;
    }


    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5};

        System.out.println("Unique number:"+uniqueNum(arr));  

        System.out.println("Unique number:"+uniqueNum2(arr));

        System.out.println("Unique number:"+uniqueNum3(arr));


    }
    
}
