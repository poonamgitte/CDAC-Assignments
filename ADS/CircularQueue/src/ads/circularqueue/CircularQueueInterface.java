package ads.circularqueue;

public interface CircularQueueInterface {
	void enqueue(int data);
	int dequeue();
	boolean isFull();
	boolean isEmpty();
	
}
