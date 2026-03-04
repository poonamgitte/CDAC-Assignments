package ads.bst;

import java.util.List;

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

public class BinarySearchTreeClass implements BinarySearchTree{
	
	Node root;

	@Override
	public  void insert(Node root, int val) {
		// TODO Auto-generated method stub
		
		Node newNode = new Node(val);
		
		// if root is null
		if(root == null) {
			root = newNode;
			return;
		}
		
		// Checking for position in bst
		if(val < root.data) {
			if(root.left == null) {
				root.left = newNode;
				return;
			}
			else {
				insert(root.left, val);
			}
		}
		else if(val > root.data) {
			
			if(root.right == null) {
				root.right = newNode;
				return;
			}
			else {
				
				insert(root.right, val);
			}
		}
	
		
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Integer> inorderTraversal(Node root, List<Integer> list) {
		
		if(root == null) {
			return null;
		}
		
		inorderTraversal(root.left, list);  // left
		
		list.add(root.data);		// root
		
		inorderTraversal(root.right, list);  //Right
 		
		
		return list;
	}

	@Override
	public List<Integer> preorderTraversal(Node root) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> postorderTraversal(Node root) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> levelOrderTraversal(Node root) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
