
public class MergeArray {
	
	public static void display(int[] arr) {
			
			for(int num :arr) {
				System.out.print(num + " ");
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,6,9,12};
		int[] arr2 = {2,5,7,8};
		
		int size = arr1.length+arr2.length;
		
		int[] mergedArr = new int[size];
		
		int arr1ptr = 0;
		int arr2ptr = 0;
		int mergedptr = 0;
		
		// Merge Arr1 and Arr2
		while(arr1ptr <arr1.length && arr2ptr < arr2.length) {
			
			if(arr1[arr1ptr] < arr2[arr2ptr]) {
				mergedArr[mergedptr++] = arr1[arr1ptr++] ;
			}
			else {
				mergedArr[mergedptr++] = arr2[arr2ptr++] ;
			}
		}
		
		// Insert remaining elements of arr1
		while(arr1ptr < arr1.length) {
			mergedArr[mergedptr++] = arr1[arr1ptr++] ;
		}
		
		// Insert remaining elements of arr2
		while(arr2ptr < arr2.length) {
			mergedArr[mergedptr++] = arr2[arr2ptr++] ;
		}
		
		display(mergedArr);
		
 	}

}
