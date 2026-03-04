
public class BinarySearchTreeEntry {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
		
        bst.insert( 15);
		bst.insert(10);
		bst.insert(20);
        bst.insert( 30);

        bst.insert( 35);
        bst.insert( 25);

		
        System.out.println("\nInorder traversal:");
		bst.inorderTraversal(bst.root);

        System.out.println("\npreOrder traversal:");
        bst.preorderTraversal(bst.root);

        System.out.println("\nPostorder traversal");
        bst.postorderTraversal(bst.root);

        System.out.println("\nlevel traversal");
        System.out.println("Level Order Traversal:"+bst.levelOrderTraversal(bst.root));

        bst.delete(bst.root, 15);

        System.out.println("\nInorder traversal:");
		bst.inorderTraversal(bst.root);

    }
}
