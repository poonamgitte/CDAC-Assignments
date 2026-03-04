package ads.bst;

public interface BinaryTreeInterface {

	void insert(int val);
	void delete(int val);
	void inorder(Node root);
	void preorder(Node root);
	void postorder(Node root);
	void levelorder(Node root);
}
