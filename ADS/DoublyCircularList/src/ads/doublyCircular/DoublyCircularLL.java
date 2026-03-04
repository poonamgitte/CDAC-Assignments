package ads.doublyCircular;



public class DoublyCircularLL implements DoublyCircularInterface {
	
	public class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {

			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	Node head = null;
	Node tail = null;
	@Override
	public void addAtFirst(int data) {
		
		Node newNode = new Node(data);
		
		if (head==null) {
			head = newNode;
			tail = newNode;
			
			head.prev=newNode;
			tail.next=newNode;
			return;
		}
		
		
		head.prev = newNode;
		newNode.next = head;
		tail.next = newNode;
		newNode.prev = tail;
		head = newNode;
		
	}

	@Override
	public void addAtLast(int data) {

		Node newNode = new Node(data);
		
		if (head==null) {
			head = newNode;
			tail = newNode;
			
			head.prev=newNode;
			tail.next=newNode;
			return;
		}
		
		newNode.prev=tail;
		newNode.next=head;
		tail.next=newNode;
		head.prev=newNode;
		
		tail = newNode;
	}

	@Override
	public void addAtPosition(int position, int data) throws Exception {
	
		Node newNode = new Node(data);
		
		if (head==null) {
			head = newNode;
			tail = newNode;
			
			head.prev=newNode;
			tail.next=newNode;
			return;
		}
		if(position==0) {
			addAtFirst(data);
			return;
		}
		
		int count = 0;
		
		Node temp = head;
		
		while(temp.next != head) {
			count++;
			
			if(count == position) {
				newNode.next = temp.next;
				newNode.prev=temp;
				temp.next.prev=newNode;
				temp.next = newNode;
				
				break;
			}
			
			temp = temp.next;
			
		}
		
	}

	@Override
	public void deleteFirst() throws Exception {
		
		if(head==null) {
			throw new Exception("list is empty");
		}
		
		if(head.next==head) {
			head=null;
			tail=null;
			return;
		}
		head=head.next;
		head.prev=tail;
		tail.next=head;
		
	}

	@Override
	public void deleteLast() throws Exception {
		
		if(head==null) {
			throw new Exception("list is empty");
		}
		if(head.next==head) {
			head=null;
			tail=null;
			return;
		}
		
		tail=tail.prev;
		head.prev=tail;
		tail.next=head;
		
	}

	@Override
	public void deleteAtPosition(int position) throws Exception {

		if(head==null) {
			throw new Exception("list is empty");
		}
		
		if(position==0) {
			deleteFirst();
			return;
		}
		
		Node current = head;
		
		for(int i=0;i<position-1;i++) {
			current=current.next;
			if(current.next==head) {
				throw new Exception("Position not found");
			}
		}
		current.next=current.next.next;
		current.next.prev=current;
		
		if(current.next == head) 
			tail = tail.prev;
	
	}

	@Override
	public void deleteByValue(int data) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean searchByValue(int data) {
		// TODO Auto-generated method stub
		return false;
	}
		
	public void displayForward() throws Exception {
		
		if(head == null){
			throw new Exception("List is empty");
		}
		Node temp = head;
		do {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}while ( temp != head);
		
		System.out.println();
	}
	
	public void displayBackward() throws Exception {
		
		if(head == null){
			throw new Exception("List is empty");
		}
		Node temp = tail;
		do {
			System.out.print(temp.data + "->");
			temp = temp.prev;
		}while ( temp != tail);
		
		System.out.println();
	}
	
	
}
