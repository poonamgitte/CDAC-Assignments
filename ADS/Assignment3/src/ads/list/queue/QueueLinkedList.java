package ads.list.queue;

import ads.list.SinglyLinkedList;

public class QueueLinkedList implements Queue {

	SinglyLinkedList list = new SinglyLinkedList();

	@Override
	public void enqueue(int element) {
		list.addAtEnd(element);
	}

	@Override
	public int dequeue() {
		
		return list.deleteFirstNode();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void display() {
		list.display();
	}
	
	
	
}
