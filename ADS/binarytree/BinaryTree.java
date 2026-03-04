package ads.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class BinaryTree {

	private Node root;

	public Node getRoot() {
		return root;
	}

	public void insert(int data) {

		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
		} else {

			Scanner sc = new Scanner(System.in);

			Node traverse = root;
			while (true) {

				System.out.println("Left or Right(L or R):" + traverse.data);
				char choice = sc.next().toLowerCase().charAt(0);

				if (choice == 'l') {

					if (traverse.left == null) {
						System.out.println("Left of:" + traverse.data + " is " + newNode.data);
						traverse.left = newNode;
						break;
					} else {
						traverse = traverse.left;
					}
				} else if (choice == 'r') {

					if (traverse.right == null) {
						System.out.println("right of:" + traverse.data + " is " + newNode.data);
						traverse.right = newNode;
						break;
					} else {
						traverse = traverse.right;
					}
				}

			}
		}

	}

	// Inorder Traversal
	public void inOrder(Node root) {

		if (root == null) {
			return;
		}

		// left
		inOrder(root.left);

		// Root
		System.out.print(root.data + " ");

		// Right
		inOrder(root.right);
	}

	// PreOrder traversal
	public void preOrder(Node root) {
		if (root == null) {
			return;
		}

		// Root
		System.out.print(root.data + " ");

		// left
		preOrder(root.left);

		// Right
		preOrder(root.right);
	}

	// PostOrder traversal
	public void postOrder(Node root) {
		if (root == null) {
			return;
		}

		// left
		postOrder(root.left);

		// Right
		postOrder(root.right);

		// Root
		System.out.print(root.data + " ");

	}

	// Level order traversal
	public void levelOrder() {

		if (root == null)
			return;

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);

		while (!queue.isEmpty()) {

			Node temp = queue.poll();

			System.out.println(temp.data);

			if (temp.left != null) {
				queue.add(temp.left);
			}

			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
	}

	// PreOrder iterative

	public void preOrderIterative() {

		if (root == null) {
			return;
		}

		Stack<Node> stack = new Stack<>();

		stack.push(root);

		while (!stack.isEmpty()) {
			Node temp = stack.pop();

			System.out.print(temp.data + " ");

			if (temp.right != null) {
				stack.push(temp.right);
			}

			if (temp.left != null) {
				stack.push(temp.left);
			}
		}

	}

	public void postOrderIterative() {

		if (root == null) {
			return;
		}

		Stack<Node> stack = new Stack<>();

		stack.push(root);

		while (!stack.isEmpty()) {
			Node temp = stack.pop();


			if (temp.right != null) {
				stack.push(temp.right);
			}

			if (temp.left != null) {
				stack.push(temp.left);
			}
			
			System.out.print(temp.data + " ");
		}

	}
}
