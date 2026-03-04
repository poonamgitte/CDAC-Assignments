
class Rectangle {
	int length;
	int breadth;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area () {
		int area = length*breadth;
		System.out.println("Area:"+area);
	}
	
	public void perimeter() {
		int perimeter = 2*(length+breadth);
		System.out.println("Perimeter:"+perimeter);
	}
	
	
}
