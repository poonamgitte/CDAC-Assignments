// Program to find diameter of tree

public class Q4_DiameterOfBinaryTree {

    // Diameter => maximum path distance between any two nodes in tree
    // diameter = Hleft + Hright
    //TC - O(n)   SC - O(h)
    public static int diameter(Node root){
        int [] maxPath = new int[1];

        helper(root, maxPath);
        return maxPath[0];
      
    }

      // to find height of left 
         //TC - O(n)   SC - O(h)
    public static int helper(Node root, int[] maxPath){

        if(root == null ){
            return 0;
        }

        int Hleft = helper(root.left, maxPath);     //  process Left 
        int Hright = helper(root.right, maxPath);   // Precess right

        // Updating diameter 
        maxPath[0] = Math.max(maxPath[0], Hleft + Hright);  // process root

        return 1 + Math.max(Hleft, Hright);

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

       System.out.println("Diameter of tree : "+diameter(root));
       
    }
}
