
public class Palindrome {
	

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter Number to check Palindrome or not:");
		num=ConsoleInput.getInteger();
		
		int rev=0;
		int rem=0;
		
		int temp=num;
		while(temp!=0) {
			rem=temp%10;
			rev = (rev*10)+rem;
			temp=temp/10;
		}
		
		if(num==rev) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
		
	}
	}
