
public class RotateArray {
	
	static void rotateArr(int nums[], int result[]) {
		
		int i=0;
		int j=nums.length-1;
		
		while(i <= j){
			result[j] = nums[i];
			result[i] = nums[j];
			i++;
			j--;
		}
	}
	
	static void display(int nums[]) {
		
		for(int n:nums) {
			System.out.print(n+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,30,40,50,60,70};
		
		int result[] = new int[arr.length];
		System.out.println("Original Array:");
		display(arr);
		
		rotateArr(arr,result);
		
		System.out.println("\nRotated Array:");
		display(result);

	}

}
