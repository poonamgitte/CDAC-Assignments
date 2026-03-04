// Remove second last element

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class Q17_RemoveSecondLast {

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

    // Remove second last element

    public static Node removeSecondLast(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node slow = head;
        Node fast = head;

        // Set fast pointer 2 steps ahead
        for(int i=0; i<2; i++){
            fast = fast.next;
        }

        // If there are only 2 nodes and we need to delete secondlast i,e. head
        if(fast == null){
            return head.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
 
    public static void main(String[] args) {
        
        int [] arr = {1};

        Node head = arrayToLinkedlist(arr);
        print(head);

        head = removeSecondLast(head);
        print(head);

    }
}
