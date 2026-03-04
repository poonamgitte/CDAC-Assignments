import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

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

	// TC - O(n)    SC - O(h)
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
	// TC - O(n)    SC - O(h)
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

	// TC - O(n)    SC - O(h)
    public void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

	// TC - O(n)    SC - O(h)
    public void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

	// TC - O(n)    SC - O(h)
    public void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }


	// Iterative preorder Traversal
	// TC - O(n)  SC - O(h) 

	public void iterativePreorder(Node root){

		if(root == null){
			return;
		}

		Stack<Node>stack = new Stack<>();

		stack.push(root);

		while(!stack.isEmpty()){

			Node temp = stack.pop();

			System.out.print(temp.data+" ");

			if(temp.right != null){
				stack.push(temp.right);
			}

			if(temp.left != null){
				stack.push(temp.left);
			}
		}
	}

	// Iterative inorder traversal
	public void iterativeInorder(Node root){

		if(root == null){
			return ;
		}

		List<Integer>list = new LinkedList<>();

		Stack<Node>stack = new Stack<>();
		Node curr = root;

		while(curr != null || !stack.isEmpty()){

			// Go deep to left
			while(curr != null){
				stack.push(curr);
				curr = curr.left;
			}

			curr = stack.pop();
			list.add(curr.data);

			curr = curr.right;

		}

		System.out.println("Iterative Inorder: "+ list);
	}

}
