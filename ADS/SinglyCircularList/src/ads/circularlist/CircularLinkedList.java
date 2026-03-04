package ads.circularlist;


public interface CircularLinkedList {
	void addAtFirst(int data);
	void addAtEnd(int data);
	void addAtPosition(int position,int data) throws Exception;
	void deleteFirstNode() throws Exception;
	void deleteLastNode() throws Exception;
	void deleteAtPosition(int Position) throws Exception;
	void deleteValue(int value) throws Exception;
	boolean isEmpty();
//	void deleteCurrentNode(Node current);
	boolean search(int element);
}
