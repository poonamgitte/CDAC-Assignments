package ads.list;

import ads.list.SinglyLinkedList.Node;

public interface List {
	void addAtFirst(int data);
	void addAtEnd(int data);
	void addAtPosition(int position,int data);
	int deleteFirstNode();
	int deleteLastNode();
	int deleteAtPosition(int Position);
	void deleteValue(int value);
	boolean isEmpty();
	void deleteCurrentNode(Node current);
	boolean search(int element);
}
