// Find rotation count in rotated array


public class Q20_CountRotationInArray {

    public static int countRotation(int[] arr){
        int pivot = findPivot(arr);

        return pivot+1;

    }

    // function to find pivot element
    public static int findPivot(int[] arr){

        int start =0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1]){
                return mid;
            }

            else if (arr[mid] < arr[mid-1]){
                return mid-1;
            }

            else if(arr[mid] > arr[start]){
                start = start+1;
            }
            else{
                end = mid -1;
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[] = {5,6,7,1,2,3,4};

        System.out.println("Rotation count:" + countRotation(arr));
    }    
}
