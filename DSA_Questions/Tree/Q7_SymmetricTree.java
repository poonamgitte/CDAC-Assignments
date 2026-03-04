// Check is symmetric tree or not / mirror image subtrees

public class Q7_SymmetricTree {

    // TC - O(n)  SC - O(h)
    public static boolean isSymmetricTree(Node root){

        if(root == null){
            return true;
        }

        return isSymmetricSubtree(root.left, root.right);
    }
  
    public static boolean isSymmetricSubtree(Node left, Node right)
    {
        if(left == null || right == null){
            return (left == right); // if both are null then true else false
        }

        return left.data == right.data && isSymmetricSubtree(left.left, right.right) && isSymmetricSubtree(left.right, right.left);
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
        root.right = new Node(2);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(5);
        root.right.right = new Node(4);

        // Print tree traversals
        System.out.print("Inorder Traversal: ");
        tree.inorder(root);
        System.out.println();

       System.out.println("Diameter of tree : "+isSymmetricTree(root));
       
    }
}
