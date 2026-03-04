package ads.bst;

import java.util.Scanner;

public class BinarySearchTreeEntry {

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();

		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n0.Exit");
			System.out.println("1.Add Node");
			System.out.println("2.In order traversal");
			System.out.println("3.Pre Order Traversal");
			System.out.println("4.Post Order traversal");
			System.out.println("5. Level Order traversal");
			System.out.println("6.delete");

			System.out.println("enter choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Enter data to add node:");
				int data = sc.nextInt();

				tree.insert(data);
			}
				break;

			case 2: {
				System.out.println("In order traversal:");
				tree.inOrder(tree.getRoot());
//
			}
				break;

			case 3: {
				System.out.println("\nPre order traversal:");
				tree.preOrder(tree.getRoot());

//				System.out.println("\nIterative pre order traversal :");
//				tree.preOrderIterative();
			}
				break;
			case 4: {
				System.out.println("\nPost order traversal:");
				tree.postOrder(tree.getRoot());

//				System.out.println("\nIterative pre order traversal :");
//				tree.preOrderIterative();
			}
				break;
			case 5: {
				System.out.println("\nPre order traversal:");
				// tree.levelOrder(tree.getRoot());

//				System.out.println("\nIterative pre order traversal :");
//				tree.preOrderIterative();
			}
				break;
			case 6: {
				System.out.println("Enter value to delete");
				int value = sc.nextInt();
				tree.deleteNode(tree.getRoot(), value);
			}
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}

		} while (choice != 0);
	}
}
