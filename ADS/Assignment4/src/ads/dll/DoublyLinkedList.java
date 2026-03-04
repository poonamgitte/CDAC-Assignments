package ads.dll;

public class DoublyLinkedList implements DLLInterface{

	public class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {
		
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	Node head=null;
	Node tail=null;
	
	
	@Override
	public void addAtFirst(int data) {
		
		Node newNode=new Node(data);
		if(isEmpty()) {
			head=newNode;
			tail=newNode;
			return;
		}
		head.prev=newNode;
		newNode.next=head;
		head=newNode;

	}
	
	
	@Override
	public void addAtLast(int data) {
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			head=newNode;
			tail=newNode;
			return;
		}
	
		tail.next=newNode;
		newNode.prev=tail;
		tail=newNode;
	
	}
	@Override
	public void addAtPosition(int position, int data) {
		
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			if(position==0) {
				head=newNode;
				tail=newNode;
			}
			return;
		}
		
		if(position == 0) {
			addAtFirst(data);
			return;
		}
		
		Node current=head;
		
		//Node previous=null;
	
		for(int i=0;i<position-1;i++) {
			
			current=current.next;
			if(current==null) {
				return;	
			}
		}
		
		if(current.next == null) {
			addAtLast(data);
			return;
		}
		
		newNode.next = current.next;
		newNode.prev = current;
		current.next.prev=newNode;
		current.next=newNode;
		
	}
	
	
	@Override
	public int deleteFirst() {
		
		if(isEmpty() ) {
			return -1;
		}
		
		int tempData =head.data;
		
		if(head.next == null) {
			head = null;
			tail = null;
			return tempData;
		}
		
		head = head.next;
		head.prev = null;
		
		return tempData;
	}
	
	@Override
	public int deleteLast() {
		
		if(isEmpty()) {
			return -1;
		}
		
		int tempData = tail.data;
		
		if(head.next == null) {
			head = null;
			tail = null;
			return tempData;
		}
		
		tail = tail.prev;
		tail.next = null;
		
		return tempData;
	}
	
	@Override
	public int deleteAtPosition(int position) {
		
		if(isEmpty()) {
			return -1;
		}
		
		if(position == 0) {
			return deleteFirst();
		}
		
		Node trav = head;
		
		for(int i=0; i<position-1;i++) {
			trav = trav.next;
			
			if(trav == null || trav.next == null) {
				return -1;
			}
		}
		
		if(trav.next == tail) {
			return deleteLast();
		}
		
		int tempData = trav.next.data;
		
		trav.next.next.prev = trav;
		trav.next = trav.next.next;
		
		return tempData;
	}
	
	@Override
	public void deleteByValue(int data) {
		
		if(head == null) {
			return;
		}
		
		while(head.data == data) {
			head = head.next;
		}
		
		Node trav = head;
		
		while(trav.next != null) {
			
			if(trav.next.data == data) {
				trav.next = trav.next.next;
			}
			else {
				trav = trav.next;
			}
		}
	}
	
	@Override
	public boolean searchByValue(int data) {
		
		if(head == null) {
			return false;
		}
		
		Node trav = head;
		while(trav != null) {
			
			if(trav.data == data) {
				return true;
			}
			trav = trav.next;
		}
		
		return false;
	}
	
	@Override
	public boolean isEmpty() {
		
		if(head==null) {
			return true;
		}
		return false;
	}
	
	public void display()
	{
		Node trav=head;
		
		while(trav!=null) {
			System.out.print(trav.data+"->");
			trav=trav.next;
		}
		System.out.println();
	}
	
	
	
	
	
}
