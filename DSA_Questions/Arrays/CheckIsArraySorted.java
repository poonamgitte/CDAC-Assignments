// Check that array is sorted or not

public class CheckIsArraySorted {
    
    static boolean isArrSorted(int[] arr, boolean ascending){

        // for 1 and less length array
        if(arr == null || arr.length <= 1){
            return true;
        }

        // check for ascending and descending sorting

        for(int i=0; i<arr.length-1; i++){
            if(ascending && arr[i] > arr[i+1]){
                return false;
            }
            if(!ascending && arr[i] < arr[i+1]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr= {6,5,4,6,2};

        boolean ascending = arr[0] < arr[arr.length-1] ? true : false;

        if(isArrSorted(arr,ascending)){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
}
