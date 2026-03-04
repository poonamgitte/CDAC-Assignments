// Leetcode 203 Remove all nodes withb given value

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class Q11_RemoveElements{

    // Function to convert from array to linked list
    public static Node arrayToLinkedlist(int [] arr){

        Node head = new Node(arr[0]);
        Node temp = head;

        for(int i = 1; i<arr.length;i++){
            Node newNode = new Node(arr[i]);

            temp.next = newNode;
            temp = newNode;

        }

        return head;
    }

    //print

      public static void print(Node head){

        Node temp = head;


        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }


    // Remove Element       TC - O(n)  SC - O(1)
    public static Node removeElements(Node head, int val){

        if(head == null){
            return head;
        }

        Node temp = head;

        while(temp.next != null){

            if(temp.next.data == val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }

        if(head.data == val){
            head = head.next;
        }

        return head;
    }

    // Better clean approach
    //Approach2     TC- O(N)  SC - O(1)

     public static Node removeElements2(Node head, int val){

        if(head == null){
            return head;
        }

        Node dummyNode = new Node(-1);   // No need to check for head
        dummyNode.next = head;
        Node temp = dummyNode;

        while(temp.next != null){

            if(temp.next.data == val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }

        return dummyNode.next;
    }

 
    public static void main(String[] args) {
        
        int [] arr = {6,6,6,1,2,6,3,4,5,6};

        Node head = arrayToLinkedlist(arr);
        print(head);

        int val = 6;
        // head = removeElements(head, val);
        // print(head);

        head = removeElements2(head, val);
        print(head);

    }
}
