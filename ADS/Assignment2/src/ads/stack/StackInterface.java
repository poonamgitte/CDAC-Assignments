package ads.stack;

public interface StackInterface {
	void push(int element) throws Exception;
	int pop() throws Exception;
	boolean isEmpty();
	boolean isFull();
	
}
