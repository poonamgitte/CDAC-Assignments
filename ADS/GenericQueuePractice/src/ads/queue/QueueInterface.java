package ads.queue;

public interface QueueInterface<T> {

	void enqueue(T data);
	T dequeue();
	boolean isEmpty();
	boolean isFull();
	T peek();
}
