package ads.dll;

public interface DLLInterface {
	
	void addAtFirst(int data);
	void addAtLast(int data);
	void addAtPosition(int position,int data);
	
	int deleteFirst();
	int deleteLast();
	int deleteAtPosition(int position);
	void deleteByValue(int data);
	
	boolean searchByValue(int data);
	
	
	boolean isEmpty();
}
