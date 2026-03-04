package ads.doublylinkedlist;

public class DoublyLinkedList implements DoublyLinkedListInterface {

	Node head = null;
	Node tail = null;

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
	
	// function to add node at last
	@Override
	public void add(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}

		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;

	}

	// function to add element at position
	@Override
	public void insert(int position, int data) {

		Node newNode = new Node(data);

		if (head == null) {
			if (position == 0) {
				head = newNode;
				tail = newNode;
			}
			return;
		}

		if (position == 0) {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
			return;
		}

		Node current = head;

		for (int i = 0; i < position - 1; i++) {

			current = current.next;
			if (current == null) {
				return;
			}
		}

		if (current.next == null) {
			add(data);
			return;
		}

		newNode.next = current.next;
		newNode.prev = current;
		current.next.prev = newNode;
		current.next = newNode;

	}

	// Function to delete element first occurence
	@Override
	public void deleteElement(int element) throws Exception {
		// If list is Empty
		if (head == null) {
			throw new Exception("List is empty");
		}

		// if element is head
		if (head.data == element) {
			head = head.next;

			if (head == null) {
				tail = null;
				return;
			}

			head.prev = null;
			return;
		}

		Node current = head;
		Node previous = null;

		// traverse to current
		while (current != null) {
			if (current.data == element) {
				break;
			}
			previous = current;
			current = current.next;
		}
		if (current == null) {
			throw new Exception("Element not found");
		}
		if (current.next == null) {
			tail = tail.prev;
			tail.next = null;
			return;
		}
		current.next.prev = previous;
		previous.next = current.next;

	}

	//Function to delete all occurences
	@Override
	public void deleteAllOccurences(int element) throws Exception {

		if (head == null) {
			throw new Exception("List is empty");
		}

		while (head.data == element) {
			head = head.next;
			head.prev = null;
		}

		Node current = head;

		while (current.next != null) {

			if (current.next.data == element) {
				if (current.next.next == null) {
					tail = tail.prev;
					tail.next = null;
					return;
				}
				current.next.next.prev = current;
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}

	}

	public void display() {
		Node trav = head;

		while (trav != null) {
			System.out.print(trav.data + "->");
			trav = trav.next;
		}
		System.out.println();
	}

}
