package ads.genericqueue;

public interface Queue<T> {
	void enqueue(T element) throws QueueException;
	T dequeue() throws QueueException;
	boolean isFull();
	boolean isEmpty();
}
