package ads.circularlist;

public class SinglyCircularList implements CircularLinkedList {
	
	Node head=null;
	
	class Node {
		int data;
		Node next;
	
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	@Override
	public void addAtFirst(int data) {
		
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			head = newNode;
			newNode.next = head;
			return;
		}
		
		Node current = head;
		
		while(current.next != head) {
			current = current.next;
		}
		
		newNode.next = head;
		current.next = newNode;
		head = newNode;
		
	}

	@Override
	public void addAtEnd(int data) {
		
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			head = newNode;
			newNode.next = head;
			return;
		}
		
		Node temp = head ;
		
		while(temp.next != head) {
			temp = temp.next;
		}
		
		newNode.next = head;
		temp.next = newNode;
		
	}

	@Override
	public void addAtPosition(int position, int data) throws Exception {
		
		
			if(position == 0) {
				addAtFirst(data);
				return;
			}
			else if(isEmpty() && position > 0){
				throw new Exception("Position not found");
			}

			Node newNode = new Node(data);
			
			int count = 0;
			
			Node temp = head;
			
			while(temp.next != head) {
				count++;
				
				if(count == position) {
					
					newNode.next = temp.next;
					temp.next = newNode;
					
					break;
				}
				
				temp = temp.next;
				
			}
			
	}

	@Override
	public void deleteFirstNode() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("List is Empty");
		}
		
		if(head.next == head) {
			head = null;
			return;
		}
		
		Node temp = head;
		
		while(temp.next != head) {
			temp = temp.next;
		}
		
		head = head.next;
		temp.next = head;
	
	}

	@Override
	public void deleteLastNode() throws Exception {
	
		if(isEmpty()) {
			throw new Exception("List is Empty");
		}
		
		if(head.next == head) {
			head = null;
			return;
		}
		
		Node previous = null;
		Node temp = head;
		
		while(temp.next != head) {
			previous = temp;
			temp = temp.next;
		}
		
		previous.next = head;
	}

	@Override
	public void deleteAtPosition(int Position) throws Exception {
		
		if(isEmpty()) {
			throw new Exception("List is Empty");
		}
	
		if(Position==0) {
			deleteFirstNode();
			return;
		}
		
		Node current = head;
		for(int i=0;i<Position-1;i++) {
			current=current.next;
			if(current.next==head) {
				throw new Exception("Position not found");
			}
		}
		current.next=current.next.next;
	}

	@Override
	public void deleteValue(int value) throws Exception {
		if(isEmpty()) {
			throw new Exception("List is Empty");
		}
		
		while(head.data == value){
			deleteFirstNode();
		}
		
		Node previous = null;
		Node temp = head;
		
		while(temp.next != head) {
			
			if(temp.data == value) {
				previous.next = temp.next;
			}
			previous = temp;
			temp = temp.next;
		}
		
		
	}

	@Override
	public boolean isEmpty() {
		
		if(head == null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean search(int element) {
		
		return false;
	}
	
	public void display() throws Exception {
		
		if(head == null) {
			throw new Exception("List is empty");
		}
		
		Node temp = head;
		
		do{
			System.out.print(temp.data+"->");
			temp = temp.next;
			
		}while(temp!= head);
		
		System.out.println();
	}

}
