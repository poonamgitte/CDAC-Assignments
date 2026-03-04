package ads.day6;

public class Multiply {
	
	public static int multiply(int n1, int n2) {
		
		if(n1 == 0 || n2 == 0) {
			return 0;
		}
		
		if(n1 == 1) {
			return n2;
		}
		
		if(n2 == 1) {
			return n1;
		}
		
		
		if(n1<n2) {
			return n2 + multiply(n1-1, n2);
		}
		else {
			return n1 + multiply(n1, n2-1);
		}
	}
	
	// function to handle -ve numbers
	public static int multiplyWrapper(int n1, int n2) {
		
		int a = Math.abs(n1);
		int b = Math.abs(n2);
		
		int product = multiply(a, b);
		
		if(n1 >= 0 && n2 >= 0 || n1 <0 && n2 < 0) {
			return product;
		}
		else  {
			return -product;
		}
		
	}
	
	public static void main(String[] args) {
		
		int num1 = 3, num2 = -5;
	
		//System.out.println("Muliplication:"+multiply(num1, num2));
		
		System.out.println("Muliplication:"+multiplyWrapper(num1, num2));
	}
}
