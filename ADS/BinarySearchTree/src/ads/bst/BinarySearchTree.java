package ads.bst;

import java.util.LinkedList;
import java.util.Queue;



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

public class BinarySearchTree {
	private Node root;

	public Node getRoot() {
		return root;
	}

	// Insert node
	public void insert(int data) {
		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
		} else {

			Node current = root;

			while (true) {

				if (data < current.data) {
					if (current.left == null) {
						current.left = newNode;
						break;
					} else {
						current = current.left;
					}
				} else if (data > current.data) {
					if (current.right == null) {
						current.right = newNode;
						break;
					} else {
						current = current.right;
					}
				}
			}
		}

	}

	// Inorder traversal
	public void inOrder(Node root) {

		if (root == null) {
			return;
		}

		inOrder(root.left); // process left
		System.out.print(root.data + " "); // process root
		inOrder(root.right); // Process right
	}

	// PreOrder traversal
	public void preOrder(Node root) {

		if (root == null) {
			return;
		}

		System.out.print(root.data + " "); // process root

		preOrder(root.left); // process left
		preOrder(root.right); // Process right
	}

	// Post order traversal
	public void postOrder(Node root) {

		if (root == null) {
			return;
		}
		postOrder(root.left); // process left
		postOrder(root.right); // Process right
		System.out.print(root.data + " "); // process root
	}
	
	public Node deleteNode(Node root,int value) {
		
		if(root==null) {
			return null;
		}
		
		if(root.data == value && root.left == null && root.right == null) {
			return null;
		}
	
		else if(value <root.data) {
			root.left = deleteNode(root.left, value);
		}
		else if(value > root.data) {
			root.right = deleteNode(root.right, value);
		}
//		if(root.data>val) {
//			root.left=deleteNode(root.left,val);
//		}else if(root.data<val){
//			root.right=deleteNode(root.right,val);
//		}else if(root.data==val){
//			return root;
//		}
		return null;
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

}
