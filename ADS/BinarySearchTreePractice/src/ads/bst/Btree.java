package ads.bst;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data ;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class Btree implements BinaryTreeInterface{
	Node root;

	// level order insertion
	@Override
	public void insert(int val) {
		// TODO Auto-generated method stub
		Node newNode = new Node(val);
		
		if(root == null) {
			root = newNode;
			return;
		}
		
		Queue<Node> q = new LinkedList<>();
		
		while(!q.isEmpty()) {
			Node temp = q.poll();
			
			// add left node into queue
			if(temp.left == null) {
				temp.left = newNode;
				return;
			}
			else {
				q.add(temp.left);
			}
			
			// adding right node into queue
			if(temp.right == null) {
				temp.right = newNode;
				return;
			}
			else {
				q.add(temp.left);
			}
			
		}
		
	}
	

	@Override
	public void delete(int val) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inorder(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		inorder(root.left);	// left
		System.out.print(root.data + " ");  // root
		
		inorder(root.right);  // root
	}

	@Override
	public void preorder(Node root) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postorder(Node root) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levelorder(Node root) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
