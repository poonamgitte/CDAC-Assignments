package ads.binarytree;

import java.util.Scanner;

public class BinaryTreeEntry {
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		
		do {
			System.out.println("0.Exit");
			System.out.println("1.Add Node");
			System.out.println("2.In order traversal");
			System.out.println("3.Pre Order Traversal");
			System.out.println("4.Post Order traversal");
			System.out.println("5. Level Order traversal");
			
			System.out.println("enter choice:");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("Enter data to add node:");
				int data = sc.nextInt();
				
				tree.insert(data);
			}
			break;
			
			case 2:{
				System.out.println("In order traversal:");
				tree.inOrder(tree.getRoot());
				
				
			}
			break;
			
			case 3:{
				System.out.println("\nPre order traversal:");
				tree.preOrder(tree.getRoot());
				
				System.out.println("\nIterative pre order traversal :");
				tree.preOrderIterative();
			}
			break;
			
			case 4:{
				System.out.println("\nPost order traversal:");
				tree.postOrder(tree.getRoot());
				
				System.out.println("\nIterative post order traversal :");
				tree.postOrderIterative();
			}
			break;
			
			case 5:{
				System.out.println("\n Level order traversal:");
				tree.levelOrder();
			}
			break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
		}while(choice != 0);
	}
}
