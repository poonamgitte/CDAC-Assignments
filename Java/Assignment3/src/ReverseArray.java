
public class ReverseArray {
	
		
		public static void display(int arr[],int n) {
			for(int num=0;num<n;num++) {
				System.out.println(arr[num]+" ");
			}
			
		} 
		public static void main(String[] args) {
			int arr[]= {10,20,30,40,50,60,70};
			int n=arr.length;
			
			int rev[]=new int[n];
			
			System.out.println("Array Before Swap");
			display(arr,n);
			
			int j=0;
			for(int i=n-1;i>=0;i--) {
				rev[j++]=arr[i];
			}
			
			System.out.println("Array after Reverse");
			display(rev,n);
			
			}
}
