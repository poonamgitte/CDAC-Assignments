// Array of product of all elements except self

public class ProductOfArr_ExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int product = 1;

        for(int i=0; i<arr.length; i++){
            
            product *= arr[i];
        }

        
        for(int i=0; i<arr.length; i++){
            
            arr[i] = product/arr[i];
        }

        
        for(int i=0; i<arr.length; i++){
            
           System.out.print(arr[i] + " ");
        }
    }
}
