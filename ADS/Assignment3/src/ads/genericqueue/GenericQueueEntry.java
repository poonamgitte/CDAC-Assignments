package ads.genericqueue;

public class GenericQueueEntry {
public static void main(String[] args) throws QueueException {
		
	GenericLinearQueue<Integer> q = new GenericLinearQueue<>(10);
		
		System.out.println("Is Queue Empty: "+q.isEmpty());
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		
		
		
		q.display();
		
		System.out.println("Is Queue Empty: "+q.isEmpty());
		System.out.println("Is Queue full: "+q.isFull());
	
		System.out.println("Dequeue: "+ q.dequeue());
		System.out.println("Dequeue: "+ q.dequeue());
	
	}
}
