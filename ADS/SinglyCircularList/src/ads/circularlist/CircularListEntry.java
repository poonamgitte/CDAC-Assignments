package ads.circularlist;

public class CircularListEntry {

	public static void main(String[] args) throws Exception {
		
		SinglyCircularList list = new SinglyCircularList();
		
		list.addAtFirst(10);
		list.addAtFirst(20);
		
		list.addAtEnd(30);
		list.addAtEnd(40);
		
		list.addAtPosition(5, 100);
		
		list.display();
		
		list.deleteFirstNode();
		list.deleteFirstNode();
		
		list.display();
		
		//list.deleteLastNode();
		//list.deleteLastNode();
		
		list.addAtFirst(10);
		list.addAtFirst(20);
		list.addAtFirst(10);
		list.addAtFirst(20);
		
		list.addAtFirst(10);
		list.addAtFirst(10);
		
		
		list.display();
		
		list.deleteValue(10);
		
		list.display();
		
		list.deleteAtPosition(4);
		list.display();
	}

}
