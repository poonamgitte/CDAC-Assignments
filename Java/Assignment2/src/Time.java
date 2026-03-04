
public class Time {
public static void main(String[] args) {
	
	int second = 86399;
	
	int hours = second/3600;
	second = second%3600;
	
	int minutes = second/60;
	second = second%60;
	
	System.out.println("seconds in Hr:Min:Sec - "+hours+":"+minutes+":"+second);
			
	
}
}
