package ads.binarytree;

public class BinaryTreeEntry {                         
	public static void main(String[] args) {
		System.out.println(2);
		BinaryTree tree = new BinaryTree();
		
		tree.root = tree.insert(tree.root, 10);
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 30);
		
		tree.levelOrder(tree.root);
		
		}
}
