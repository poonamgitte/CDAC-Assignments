package ads.list.queue;

public class ListQueueEntry {
	public static void main(String[] args) {
		
		QueueLinkedList queue = new QueueLinkedList();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(50);
		
		queue.display();
		
		System.out.println("Dequeue:"+queue.dequeue());
		System.out.println("Dequeue:"+queue.dequeue());
		
		queue.enqueue(60);
		
		queue.display();
	}
}
