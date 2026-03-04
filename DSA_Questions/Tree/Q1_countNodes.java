public class Q1_countNodes {

    // count all nodes
    // TC - O(n)    SC - O(h)
    public static int countNodes(Node root){
        
        if(root == null){
            return 0;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    //count leaf nodes
    // TC - O(n)    SC - O(h)
    public static int countLeafNodes(Node root){
         if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 1;
        }

        return 0+countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    //count internal nodes
    // TC - O(n)    SC - O(h)
     public static int countInternalNodes(Node root){
         if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 0;
        }

        return 1+countInternalNodes(root.left) + countInternalNodes(root.right);
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

        // Count nodes 
        System.out.println("No of nodes : "+countNodes(root));

        //Count leaf nodes
        System.out.println("Leaf nodes:"+countLeafNodes(root));

        //count internal nodes
        System.out.println("Leaf nodes:"+countInternalNodes(root));

    }
}
