
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,30,40};
		
		if(arr.length < 2) {
			System.out.println("Not valid array");
		}
		else if(arr[0] == arr[arr.length-1]) {
				System.out.println("True");
		}
		else {
			System.out.println("False");

		}
	}

}
