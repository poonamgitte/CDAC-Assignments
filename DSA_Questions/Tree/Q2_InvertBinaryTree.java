public class Q2_InvertBinaryTree {

    public static void invertTree(Node root){
        if(root == null){
            return ;
        }

        //Optional
        if(root.left == null && root.right == null){
            return;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right= temp;

        invertTree(root.left);
        invertTree(root.right);
    }

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

        invertTree(root);
        tree.inorder(root);
        System.out.println();

       
    }
}
