package ads.doublyCircular;

public interface DoublyCircularInterface {
	void addAtFirst(int data);
	void addAtLast(int data);
	void addAtPosition(int position,int data) throws Exception;
	
	void deleteFirst() throws Exception;
	void deleteLast() throws Exception;
	void deleteAtPosition(int position) throws Exception;
	void deleteByValue(int data) throws Exception;
	
	boolean searchByValue(int data);
	
}
