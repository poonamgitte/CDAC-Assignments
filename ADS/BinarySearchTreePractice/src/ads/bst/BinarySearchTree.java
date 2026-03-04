package ads.bst;

import java.util.List;

public interface BinarySearchTree {
	
	void insert(Node root, int val);
	int delete();
	List<Integer> preorderTraversal(Node root);
	List<Integer> postorderTraversal(Node root);
	List<Integer> levelOrderTraversal(Node root);
	List<Integer> inorderTraversal(Node root, List<Integer> list);
}
