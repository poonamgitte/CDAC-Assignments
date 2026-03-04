
public class Circle {
	
		static double calculatePerimeter(float radius) {
			
			return(2*Math.PI*radius);
		}
		
		static double calculateArea(float radius) {
			return (Math.PI*radius*radius);
		}
		public static void main(String[] args) {
			System.out.println("Enter radius:");
			float radius=ConsoleInput.getFloat();
			
			System.out.println("Perimeter Of Circle:"+calculatePerimeter(radius));
			System.out.println("Area Of Circle:"+calculateArea(radius));
			}
}
