package ads.circularqueue;

public class QueueEntry {

	public static void main(String[] arg) {
		
		CircularQueue queue = new CircularQueue(6);
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(10);
		queue.enqueue(60);
		
		queue.display();
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

		queue.display();

	}
}
