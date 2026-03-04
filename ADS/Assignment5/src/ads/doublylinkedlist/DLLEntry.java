package ads.doublylinkedlist;

import java.util.Scanner;

public class DLLEntry {

	public static void main(String[] args) throws Exception {
		
		DoublyLinkedList list = new DoublyLinkedList();
		try (Scanner sc = new Scanner(System.in)) {
			int choice;
			
			do {
				System.out.println("1.Add at last");
				System.out.println("2.Insert at given position");
				System.out.println("3.Delete element");
				System.out.println("4.Delete All ocuurences");
				System.out.println("5.Display List");
				System.out.println("Enter choice:");
				choice=sc.nextInt();
				
				switch(choice) {
				case 1:{
					System.out.println("Enter a new element:");
					int data=sc.nextInt();
					list.add(data);
				}break;
				case 2:{
					System.out.println("Enter element:");
					int data=sc.nextInt();
					System.out.println("Enter Position:");
					int position=sc.nextInt();
					list.insert(position, data);
				}break;
				case 3:{
					System.out.println("Enter element:");
					int data=sc.nextInt();
					list.deleteElement(data);
				}break;
				case 4:{
					System.out.println("Enter element:");
					int data=sc.nextInt();
					list.deleteAllOccurences(data);
				}break;
				case 5:{
					list.display();
				}break;
				case 6:{
					System.out.println("Exiting.....!");
				}
				break;
				default:{
					System.out.println("Invalid choice");
				}
				}
			}while(choice!=0);
		}
		
	}
}
