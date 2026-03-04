
// Check trees are identical(same) or not

public class  Q6_IdenticalTree  {

    // TC - O(n)  Sc - O(h)
    public static boolean identicalTrees(Node root1, Node root2){

        if(root1 == null || root2 == null){
            return (root1 == root2); // if both are same i. e null then return true otherwise false
        }

        // Preorder check for 
        //root data's of both tree 
        // left Subtree
        // Right subtree
        return root1.data == root2.data && identicalTrees(root1.left, root2.left) && identicalTrees(root1.right, root2.right);
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

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);

        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        root1.right.right = new Node(6);


        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);

        root2.left.left = new Node(4);
        root2.left.right = new Node(5);

        root2.right.right = new Node(6);

        // Print tree traversals
        System.out.print("Inorder Traversal: ");
        tree.inorder(root1);
        System.out.println();

       System.out.println("Diameter of tree : "+ identicalTrees(root1, root2));
       
    }
}
