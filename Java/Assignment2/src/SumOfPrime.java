
public class SumOfPrime {
	
	static boolean isPrime(int num) {
		
		if(num <= 1)
			return false;
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			
			if(num%i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	static int addPrime() {
		
		int count=0;
		int sum=0;
		int num=1;
		
		while(count<100) {
			if(isPrime(num)) {
				sum += num;
				count++;
			}
			
			num++;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		
		System.out.println("Prime sum:"+addPrime());
	}
}
