package ads.doublylinkedlist;

public interface DoublyLinkedListInterface {
	
	void add(int data);
	void insert(int position, int data);
	void deleteElement(int element) throws Exception;
	void deleteAllOccurences(int element) throws Exception;
	
}
