package ads.binarytree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
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
	Node root;
	
	//level order Insertion
	Node insert(Node root, int data) {
		Node newNode = new Node(data);
		
		if(root == null) {
			return newNode;
		}
		
		Queue<Node>queue = new LinkedList<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			
			// Check in left subtree and add new node
			if(temp.left == null)
			{
				temp.left = newNode;
				break;
			}
			else {
				queue.add(temp.left);
			}
			
			//Check in right subtree and add newnode
			
			if(temp.right == null) {
				temp.right = newNode;
				break;
			}
			else {
				queue.add(temp.right);
			}
		}
			
		return root;
	}
	
	//Level order Traversal
	void levelOrder(Node root) {
		
		if(root == null)
			return;
		
		Queue<Node>queue = new LinkedList<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			Node temp = queue.poll();
			
			System.out.println(temp.data);
			
			if(temp.left != null) {
				queue.add(temp.left);
			}
			
			if(temp.right != null) {
				queue.add(temp.right);
			}
		}
	}
}
