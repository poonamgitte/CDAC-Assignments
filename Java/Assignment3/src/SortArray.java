
public class SortArray {
	
	public static void sortAscending(int [] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			int minIndex = i;
			for(int j = i+1; j<arr.length;j++) {
				
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void sortDescending(int [] arr) {
			
			for(int i=0; i<arr.length-1; i++) {
				int maxIndex = i;
				for(int j = i+1; j<arr.length;j++) {
					
					if(arr[maxIndex] < arr[j]) {
						maxIndex = j;
					}
				}
				
				int temp = arr[maxIndex];
				arr[maxIndex] = arr[i];
				arr[i] = temp;
			}
	}
		
	public static void display(int[] arr) {
		
		for(int num :arr) {
			System.out.print(num + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		
		int size;
		
		System.out.println("Enter size of array:");
		size = ConsoleInput.getInteger();
		
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter the value:");
			
			arr[i] = ConsoleInput.getInteger();
		}
		
		do {
			System.out.println("\nEnter choice\n2.Ascending\n3.Descending");
			choice = ConsoleInput.getInteger();
			
			switch(choice) {

			
			case 2: {
				sortAscending(arr);
				display(arr);
			}
			break;
			
			case 3:{
				sortDescending(arr);
				display(arr);
			}
			break;
			}
		}while(choice != 4);
		
		
		

	}

}
