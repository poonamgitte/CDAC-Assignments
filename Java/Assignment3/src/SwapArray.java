
public class SwapArray {
	
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int n=arr.length;
		int newArr[]=new int[n];
		
		int first=0;
		int last=arr.length-1;
		
		newArr[first]=arr[last];
		newArr[last]=arr[first];
		
		first++;
		while(first<last) {
			newArr[first] = arr[first]; 
			first++;
		}
		
		for(int num=0;num<n;num++) {
			System.out.print(newArr[num]+" ");
		}
		
	}
}
