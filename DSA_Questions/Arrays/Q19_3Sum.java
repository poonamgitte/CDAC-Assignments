
import java.util.*;

// All unique triplets sums up to 0

public class Q19_3Sum {
    public static void main(String[] args) {
        int arr[] = {-3,1,2,3,3,3,-2,-1,0} ;

        int n = arr.length;

        // for(int i=0; i<arr.length;i++){
        //     for(int j= i+1;j<arr.length;j++ ){
        //         for(int k = j+1; k<arr.length;k++){

        //             if(i != j && j!= k && (arr[i]+arr[j]+arr[k]) == 0){
        //                 System.out.print(arr[i] + " "+arr[j]+" "+arr[k]+"\n");
        //             }
        //         }
        //     }
        // }

        // 

        // HashMap<Integer, Integer>map = new HashMap<>();

        // for(int i=0; i<arr.length;i++){

        //     map.put(arr[i],i);
        // }

        //  for(int i=0; i<arr.length;i++){
        //     for(int j= i+1;j<arr.length;j++ ){

        //         int target = 0-(arr[i]+arr[j]);

        //             if( map.containsKey(target) && map.get(target) != i && map.get(target) != j){
        //                 System.out.print(arr[i] + " "+arr[j]+" "+arr[target]+"\n");
        //             }            
        //     }
        // }


        // HashMap<Integer, Integer>map = new HashMap<>();

        // for(int i=0; i<arr.length;i++){
        //     map.put(arr[i], i);
        // }


        // for(int j=0; j<arr.length;j++){
        //     for(int k=j+1;k<arr.length;k++){

        //         int target = 0 - (arr[j] + arr[k]);

        //         if(map.containsKey(target) && map.get(target) != j && map.get(target) != k){
        //             System.out.println(arr[j] + " "+ arr[k] + " "+ target);
        //         }
        //     }
        // }


        // Brute force O(n^3)

        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i<n; i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1; k<n;k++){

                    if(((arr[i] + arr[j]+ arr[k]) == 0)){
                        List<Integer>list = Arrays.asList(arr[i],arr[j],arr[k]);
                        
                        Collections.sort(list);
                        set.add(list);
                    }
                }
            }
        }
        System.out.println(set);
    }
}
