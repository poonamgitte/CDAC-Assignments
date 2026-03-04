
public class GreaterNum {
	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		System.out.println("Enter 3 numbers");
		System.out.println("Input 1st number:");
		num1 = ConsoleInput.getInteger();
		
		System.out.println("Input 2st number:");
		num2 = ConsoleInput.getInteger();
		
		System.out.println("Input 3st number:");
		num3 = ConsoleInput.getInteger();
		
		if(num1 < num2 && num2 < num3) {
			System.out.println("result is: true");
		}
		else {
			System.out.println("result is: false");
		}
	}
}
