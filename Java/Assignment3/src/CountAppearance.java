
public class CountAppearance {
		public static void main(String[] args) {
			int arr[]= {10,99,34,78,99,21,34,56,34,78};
			
			int n=arr.length;
			
			
			
			for(int i=0;i<n;i++) {
				if(arr[i]==0)
					continue;
				int count=1;
				for(int j=i+1;j<n;j++) {
					if(arr[j]==arr[i] && arr[j]!=0) {
						count++;
						arr[j]=0;
					}
					
					
				}
				System.out.println(arr[i]+"="+count);
			}
		}
}
