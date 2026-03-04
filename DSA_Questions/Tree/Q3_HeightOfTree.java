public class Q3_HeightOfTree {

   // Height according to leaf has height 0 (considering edges as height)
   //Other way leaf height = 1 (considering node )

   // According to 1st way 

   // TC - O(n)     SC - (h)
    public static int height(Node root){

        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 0;
        }

        return 1 + Math.max(height(root.left) , height(root.right));
    }


    // depth according to root has height 0 (considering edges as depth)
   //Other way root height = 1 (considering node )

   //  According to 2nd way


     public static int depth(Node root){

        if(root == null){
            return 0;
        }

        return 1 + Math.max(depth(root.left) , depth(root.right));
    }

    public static int minDepth(Node root){
        if(root == null){
            return 0;
        }

        if(root.left == null){
            return 1+ minDepth(root.right);
        }

        if(root.right == null){
            return 1+ minDepth(root.left);
           
        }

        return 1 + Math.min(minDepth(root.left) , minDepth(root.right));
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        return 1+sum(root.left)+sum(root.right);
    }

//left leaf node sum
    public static int leftNodeSum(Node root){
        if(root == null){
            return 0;
        }

        if(root.left != null && root.left.left == null && root.left.right== null){
            //return root.data + leftNodeSum(root.right);
            return root.left.data;
        }

        return sum(root.left)+sum(root.right);
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

        System.out.println("Height:"+height(root));
       
        System.out.println("Depth:"+ depth(root));

        System.out.println("Minimum depth:"+minDepth(root));

        System.out.println("Sum of all nodes:"+sum(root));

        System.out.println("Left nodes sum:"+leftNodeSum(root));

        System.out.println("left Nodes sum:"+leftNodeSum(root));
    }
}
