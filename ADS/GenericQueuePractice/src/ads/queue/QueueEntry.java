package ads.queue;

public class QueueEntry {
	public static void main(String[] args) {
		QueueClass<Integer> q = new QueueClass<Integer>(5);
		
		q.enqueue(10);
		q.display();
		
		q.enqueue(20);
		q.display();
		
		q.enqueue(20);
		q.display();
		
		System.out.println("Dequeue:"+q.dequeue());
		System.out.println("Dequeue:"+q.dequeue());

		System.out.println("peek:"+q.peek());
	}
}
