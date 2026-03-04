package ads.arr;

public class RemoveElement {

	public static void main(String[] args) {

		int[] arr = { 3, 3, 2, 3, 5, 2, 2, 10, 9 };
		int k = 2;

		int j=0;
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i] != k) {
				arr[j++] = arr[i];
			}
		}
		
		
		
		while(j<arr.length) {
			arr[j++] = k;
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		

//			while(i<arr.length && j<arr.length) {
//				
//				if(arr[i] != k) {
//					i++;
//					j++;
//				}
//				else {
//					j++;
//					while(arr[j]!= k) {
//						j++;
//					}
//					
//				}
//				int temp=arr[j];
//				arr[j]=arr[i];
//				arr[i]=temp;
//			}
//			
	

	}

}
