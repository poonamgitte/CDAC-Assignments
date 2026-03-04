//Second largest element in array

public class SecondLargest {
        public static void main(String[] args) {
        int arr[] = {14,16,17,18,20,22};
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr){

            if(num > first){
                second = first;
                first = num;
            }
            else if(num > second && num != first){
                second = num;
            }
        }

        System.err.println("Largest:"+first+"\nSecond largest:"+second);
    }
}

