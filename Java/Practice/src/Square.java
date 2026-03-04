
public class Square extends Rectangle{
	int side;

	public Square( int side) {
		super(side, side);
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(4,6);
		r.area();
		r.perimeter();
		
		Square s = new Square(5);
		s.area();
		s.perimeter();
	}
	
}
