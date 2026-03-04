package ads.stack;

public class StackEntry {

	public static void main(String[] args) throws Exception {
		StackClass stack=new StackClass(5);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		
		stack.display();
		System.out.println("Popped Element:"+stack.pop());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.display();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.display();

		
		
	}

}
