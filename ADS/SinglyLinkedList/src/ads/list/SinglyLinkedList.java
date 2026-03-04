package ads.list;



public class SinglyLinkedList implements List {

	Node head;
	public class Node {
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
			head=newNode;
			
		}else {
			newNode.next=head;
			head=newNode;
		}
	}
	
	@Override
	public void addAtPosition(int position, int data) {
		
		Node newNode = new Node(data);
		
		//IF list is empty
		if(isEmpty()) {
			if(position == 0) {		
				head = newNode;
				return;
			}
			else {
				return ;
			}
		}
		
		//if position is zero
		if(position == 0) {
			addAtFirst(data);
			return;
		}
		
		Node trav = head;
		
		//Traverse till position -1
		for(int i=0; i<position-1 ;i++) {
			trav=trav.next;
		}
		
		// If position beyond size+1
		if(trav == null) {
			return;
		}
		
		newNode.next=trav.next;
		trav.next = newNode;
		
	}

	@Override
	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			head=newNode;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		
		temp.next=newNode;
		
	}

	@Override
	public int deleteFirstNode() {
		if(isEmpty()) {
			return -1;
		}
		int temp=head.data;
		head=head.next;
		return temp;

	}

	@Override
	public int deleteLastNode() {
		if(isEmpty()) {
			return -1;
		}
		int tempData;
		if(head.next==null) {
			tempData=head.data;
			head=null;
		}
		else {
		Node temp=head;
		
		
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		tempData=temp.next.data;
		temp.next=null;
		}
		return tempData;
	}
	
	@Override
	public int deleteAtPosition(int position) {
		
		if(isEmpty() || position <0) {
			return -1;
		}
		
		int tempData;
		
		if(position == 0) {
			tempData = head.data;
			head = head.next;
			return tempData;
		}
		
		Node trav = head;
		
		for(int i=0; i<position-1; i++) {
			
			trav = trav.next;
			
			if(trav.next == null) {
				return -1;
			}
		}
		
		
		
		tempData = trav.next.data;
		trav.next = trav.next.next;
		
		return tempData;
	}
	
	@Override
	public void deleteValue(int value) {
		
		if(head == null) {
			return;
		}
		
		while(head.data == value) {
			head = head.next;
		}
		
		Node trav = head;
		
		boolean found = false;
		
		while(trav != null && trav.next != null) {
			
			if(trav.next.data == value) {
				found = true;
				trav.next = trav.next.next;
			}
			else {
				
				trav = trav.next;
			}
		}
		
		if(!found) {
			System.out.println("Value not found");
		}
	}

	@Override
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}

	public void deleteCurrentNode(Node current) {
	
		if(current == null) {
			return;
		}
		
		current.data = current.next.data;
		current.next = current.next.next;
		
	}

	@Override
	public boolean search(int element) {
		
		if(isEmpty()) {
			return false;
		}
		
		Node trav = head;
		
		while(trav != null) {
			
			if(trav.data == element) {
				return true;
			}
			trav = trav.next;
		}
		return false;
	}

}
