// Check tree balance or not

public class Q5_CheckBalanceTree {

    // balance tree => abs(Hleft - Hright) = 0 or 1
    public static boolean isBalancedTree(Node root){

        return height(root) != -1; // if not -1 then return true else false 
    }

    // calculate balance factor and check is tree balnced

    // Tc - O(n)  Sc - O(n)
    public static int height(Node root){

        if(root == null){
            return 0;
        }

        int Hleft = height(root.left);

        if(Hleft == -1) 
            return -1;

        int Hright = height(root.right);

        if(Hright == -1){
            return -1;
        }

        int BFactor = Math.abs( Hleft - Hright);

        if(BFactor > 1){
            return -1;
        }

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

       System.out.println("is balanced t: "+isBalancedTree(root));
       
    }
}
