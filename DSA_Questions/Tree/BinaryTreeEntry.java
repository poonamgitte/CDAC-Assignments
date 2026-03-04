public class BinaryTreeEntry {
    
    public static void main(String[] args) {
         /*
                  1
                 / \
                2   3
               / \   \
              4   5   6
        */

        BinaryTree tree = new BinaryTree();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        // Print tree traversals
        System.out.print("Inorder Traversal: ");
        tree.inorder(root);
        System.out.println();
        tree.iterativeInorder(root);

        System.out.print("Preorder Traversal: ");
        tree.preorder(root);
        System.out.println();
        tree.iterativePreorder(root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorder(root);
        System.out.println();
    }
}
