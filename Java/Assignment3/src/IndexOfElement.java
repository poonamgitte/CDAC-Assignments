
public class IndexOfElement {
	
	public static int searchElement(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		int mid=0;
		while(start <= end) {
			mid = (start + end)/2;
			
			if(target < arr[mid]) {
				end = mid-1;
			}
			else if(target > arr[mid]) {
				start = mid+1;
			}
			else {
				return mid;
			}
		}
		return start;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,4,5,6};
		int target=3;
		
		System.out.println("Index of element:"+searchElement(arr, target));
		
	}

}
