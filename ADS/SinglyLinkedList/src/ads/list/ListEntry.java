package ads.list;

public class ListEntry {
	public static void main(String[] args) {
		
		SinglyLinkedList list=new SinglyLinkedList();
		
		list.addAtFirst(10);
		list.addAtFirst(20);
		
		list.addAtEnd(40);
		list.addAtEnd(50);
		list.addAtFirst(60);
		
		
		list.display();
		System.out.println("delete first node"+list.deleteFirstNode());	
		System.out.println("delete Last node"+list.deleteLastNode());
		
		list.addAtPosition(3, 100);
		list.addAtPosition(5, 100);
		
		list.display();

		System.out.println("Delete at position:"+list.deleteAtPosition(3));
		
		list.addAtFirst(10);
		list.addAtFirst(10);
		list.addAtEnd(10);
		
		list.display();
		
		list.deleteValue(66);
		
		list.display();
		
		// Delete current node
		list.deleteCurrentNode(list.head.next);
		
		list.display();
		
		System.out.println("Search elment:"+list.search(10));
		System.out.println("Search elment:"+list.search(23));
		
	}
}
