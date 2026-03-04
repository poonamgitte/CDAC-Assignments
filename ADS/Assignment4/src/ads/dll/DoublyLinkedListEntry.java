package ads.dll;

public class DoublyLinkedListEntry {

	public static void main(String[] args) {
		
		
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.addAtFirst(10);
		list.addAtFirst(20);
		list.addAtFirst(30);
		
		list.addAtLast(40);
		list.addAtLast(50);
		list.addAtFirst(10);
		list.addAtLast(10);
		
		list.addAtPosition(5, 100);
		
		list.display();
		
		System.out.println("Search element:"+list.searchByValue(10));
		System.out.println("Search element:"+list.searchByValue(55));
		
		System.out.println("Delete first:"+ list.deleteFirst());
		
		list.display();
		
		System.out.println("List after deleting all occurance of element: 10");
		list.deleteByValue(10);
		
		list.display();
	
		System.out.println("Delete last:"+list.deleteLast());
		System.out.println("Delete last:"+list.deleteLast());
		
		list.display();
		
		System.out.println("Delete at position:"+list.deleteAtPosition(3));
		
		list.display();
	}

}
