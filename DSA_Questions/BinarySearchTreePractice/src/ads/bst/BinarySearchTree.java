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

public class BinarySearchTree implements BinaryTreeInterface{
	Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	@Override
	public void insert(int val) {
		root = insertRec(root,val );
	}
	
	// Helper
	private Node insertRec(Node root,int val) {
		
		if(root == null) {
			return new Node(val);
		}
		
		if(val < root.data) {
			root.left = insertRec(root.left, val);
		}
		
		else if(val > root.data) {
			root.right = insertRec(root.right, val);
		}
		
		return root;
	}

	@Override
	public void delete(int val) {
		root = deleteRec(root, val);
	}
	
	// helper
	private Node deleteRec(Node root, int val) {
		if(root == null) {
			return root;
		}
		
		if(val < root.data) {
			root.left = deleteRec(root.left, val);
		}
		
		else if(val > root.data) {
			root.right = deleteRec(root.right, val);
		}
		
		else {
			
			// case1 : if root has no child or one child
			if(root.left == null) {
				return root.right;
			}
			
			else if(root.right == null) {
				return root.left;
			}
			
			else {
				root.data = successor(root.right);
				
				root.right = deleteRec(root.right, root.data);
			}
		}
		
		return root;
	}
	
	// to find Sucessor of node
	private int successor(Node root) {
		
		if(root.left == null) {
			return root.data;
		}
		
		return successor(root.left);
	}

	@Override
	public void inorder(Node root) {
	
		if(root == null) {
			return;
		}
		inorder(root.left);	// left
		System.out.print(root.data + " ");  // root
		
		inorder(root.right);  // root
	}

	@Override
	public void preorder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");  // root
		preorder(root.left);	// left
		
		preorder(root.right);  // root
		
	}

	@Override
	public void postorder(Node root) {
		if(root == null) {
			return;
		}
		postorder(root.left);	// left
		
		postorder(root.right);  // root
		System.out.print(root.data + " ");  // root
		
	}

	@Override
	public void levelorder(Node root) {
		
		if(root == null) {
			return ;
		}
		
		Queue<Node> q = new LinkedList<>();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			Node temp = q.poll();
			
			System.out.print(temp.data + " ");
			
			if(temp.left != null) {
				q.add(temp.left);
			}
			
			if(temp.right != null) {
				q.add(temp.right);
			}
			}
	}
	
	public boolean search(int val) {
		
		if(root == null) {
			return false;
		}
		
		return searchRec(root, val);
	}
	
	private boolean searchRec(Node root, int val) {
		
		
		if(root.data == val) {
			return true;
		}
		else if(val < root.data) {
				return searchRec(root.left, val);
		}
		else if(val > root.data) {
				return searchRec(root.right, val);
		}
		
		return false;
		
	}

}
