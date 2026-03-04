package ads.bst;

public class BinarySearchTreeEntry {
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(30);
		bst.insert(20);
		bst.insert(10);
		bst.insert(15);
		bst.insert(17);
		bst.insert(70);
		bst.insert(5);
		
		System.out.println("\nInorder traversal:");
		bst.inorder(bst.root);
		
		System.out.println("\npreorder traversal:");
		bst.preorder(bst.root);
		
		System.out.println("\npostorder traversal:");
		bst.postorder(bst.root);
		
		System.out.println("\nLevel order traversal:");
		bst.levelorder(bst.root);
		
//		System.out.println("Delete node:");
//		bst.delete(10);
//		
		System.out.println("\nInorder traversal:");
		bst.inorder(bst.root);
		
		System.out.println("Search element:"+bst.search(100));
	}
}
