

public class ConsoleInput {
	
	//Get string
		static String getString() {
			try {
				byte[] arrInput = new byte[100];
				
				int length=System.in.read(arrInput);
				
				byte[] arrFinal = new byte[length-2];
				
				System.arraycopy(arrInput, 0, arrFinal, 0, length-2);
				
				String objString = new String(arrFinal);
				
				return objString;
				
			}catch(Exception e) {
				e.printStackTrace();
				return "";
			}
			
		}
	
	//Integer input
		static int getInteger() {
			int num = Integer.parseInt(getString());
			return num;
		}

	
	static float getFloat() {
		
		float num = Float.parseFloat(getString());
		return num;
	}
	
	static boolean getBoolean() {
		
		boolean b = Boolean.parseBoolean(getString());
		return b;
	}
	
	public static void main(String args[]) {
		
			
			System.out.println("Enter the name:");
			String objString = getString();
			
	
			System.out.println("Enter the number:");
			int num=getInteger();
			
			System.out.println("Enter the float number:");
			float num2=getFloat();
			
			//Print all values
			System.out.println("All values:");
			System.out.println(objString);
			System.out.println(num);
			System.out.println(num2);
			

	}
		
}
