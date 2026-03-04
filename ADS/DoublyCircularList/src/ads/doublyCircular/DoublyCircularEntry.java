package ads.doublyCircular;

public class DoublyCircularEntry {
	
	public static void main(String[] args) throws Exception {
		
		DoublyCircularLL list = new DoublyCircularLL();
		
		list.addAtFirst(10);
		list.addAtFirst(20);
		
		list.displayForward();
		list.displayBackward();
		
		list.addAtLast(30);
		
		list.displayForward();
		list.displayBackward();
		
	    list.addAtPosition(1, 3);
		list.displayForward();
		list.displayBackward();
		
		list.deleteFirst();
		list.displayForward();
		list.displayBackward();
		
		list.deleteLast();
		list.displayForward();
		//list.displayBackward();
		
		list.deleteAtPosition(1);
		list.displayForward();
//		list.displayBackward();
		
		}
}
