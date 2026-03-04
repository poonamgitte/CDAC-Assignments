// 1304. Find n elements sum upto zero 

import java.util.ArrayList;

public class Q13_Elements_Sum_Upto_Zero {
    public static void main(String[] args) {

        //nt n = 5;
        // int arr[] = new int[n];
        // int i = 0;
        // int val =1;

        // if(n%2 != 0){
        //     arr[i++] =0;
        // }

        // while(i<n){
        //     arr[i++] = val;
        //     arr[i++] = -val;
        //     val++;
        // }

        // for(int num:arr){
        //     System.out.println(num+" ");
        // }

        // Optimal using arrayList

        ArrayList<Integer>list = new ArrayList<>();

        int n = 5;

        for(int i=1;i<=n/2;i++){
            list.add(i);
            list.add(-i);
        }

        if(n%2 != 0){
            list.add(0);
        }

        System.out.println(list);
    }
}
