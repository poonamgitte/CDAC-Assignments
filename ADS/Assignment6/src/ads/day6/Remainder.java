package ads.day6;

public class Remainder {
	
	public static int remainder(int dividend, int divisor) throws Exception {
		
		if(divisor == 0) {
			throw new Exception("Division by 0 not possible");
		}
		
		if(dividend == 0 || divisor == 1 || dividend == divisor) {
			return 0;
		}
		
		if(dividend < divisor) {
			return dividend;
		}
		
		//Recursive call
		return remainder(dividend- divisor, divisor);
	}
	
	// To handle negative numbers
	public static int remainderWrapper(int dividend, int divisor) throws Exception {
		
		int a = Math.abs(dividend);
		int b = Math.abs(divisor);
		
		int rem = remainder(a,b);
		
		if(dividend >= 0 && divisor >= 0) {
			return rem;
		}
		else if(dividend < 0 && divisor >= 0) {
			return -rem;
		}
		else if(dividend >= 0 && divisor < 0) {
			return rem;
		}
		else {
			return -rem;
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		
		int dividend = -12;
		int divisor = 9;
		
		//System.out.println("Remainder: "+remainder(dividend, divisor));
		
		System.out.println("Remainder: "+remainderWrapper(dividend, divisor));
	}
}
