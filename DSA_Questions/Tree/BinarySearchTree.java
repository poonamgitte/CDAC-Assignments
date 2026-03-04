// Binary search tree implementation
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

public class BinarySearchTree {
    Node root;

    // Insert into BST

    public void insert(int val){
        root = insertVal(root, val);
    }

	public  Node insertVal(Node root,  int val) {

        if(root == null){
            return new Node(val);
        }

        if(val < root.data){
            root.left = insertVal(root.left, val);
        }
        else if(val >= root.data){
            root.right = insertVal(root.right, val);
        }

        return  root;
	}


	public Node delete(Node root , int val) {

        if(root == null){
            return root;
        }
		
		if(val < root.data){
            root.left = delete(root.left, val);
        }
        else if(val > root.data){
            root.right = delete(root.right, val);
        }
        else{

            // case1: if node has no or 1 child

            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            // If node have both child
            else{

                //Replace successor at node place
                root.data = findMin(root.right);

                root.right = delete(root.right, root.data);

            }

        }
        return root;
	}

    // finding sucessor
    private int findMin(Node root){

        if(root.left == null){
            return root.data;
        }

        return findMin(root.left);
    }

    // Helper function

	public void inorderTraversal(Node root) {
		
		if(root == null) {
			return;
		}
		
		inorderTraversal(root.left);  // left
		
		System.out.print(root.data + " ");	// root
		
		inorderTraversal(root.right);  //Right
 		
	}

	public void preorderTraversal(Node root) {

        if(root == null) {
			return;
		}
        
        System.out.print(root.data + " ");	// root
		
		preorderTraversal(root.left);  // left
		
        preorderTraversal(root.right);  //Right
 		
	}

	public void postorderTraversal(Node root) {
		
        if(root == null) {
			return;
		}
        
		
		postorderTraversal(root.left);  // left
		
        postorderTraversal(root.right);  //Right
        
        System.out.print(root.data + " ");	// root
	}

	

    // Level Order traversal 
    // Storing nodes in list levelwise
	public List<List<Integer>> levelOrderTraversal(Node root) {
	

        if(root == null){
            return new ArrayList<>();
        }

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        List<List<Integer>> list = new ArrayList<>();

        while(!queue.isEmpty()){

            int size = queue.size();
            List<Integer> level = new ArrayList<>();


            for(int i=0; i<size; i++){
                 Node temp = queue.poll();

                level.add(temp.data);

                if(temp.left != null){
                    queue.add(temp.left);
                }

                if(temp.right != null){
                    queue.add(temp.right);
                }
            }

            list.add(level);
           
        }

        return list;
	}


}
