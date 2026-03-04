package ads.queues;

public interface Queue {
	void enqueue(int element);
	int dequeue();
	boolean isFull();
	boolean isEmpty();
}
