//Swap 2 adjacent nodes of linked list

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class Q18_Swap2AdjacentNodes {

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

    // Swap node by swapping values
    //TC - O(n)  sc - O(1)
    public static Node swapNodeValues(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node first = head;
        Node second = head.next;

        while(first != null && second != null){
            int tempData = first.data;
            first.data = second.data;
            second.data = tempData;

            first = second.next;

            if(first != null){
                second = first.next;
            }

            // Or 

            // first = first.next.next;

            // if(second.next != null) {
            //     second = second.next.next;
            // }
        }

        return head;
    }

    //Swap nodes by updating links

    public static Node swapNodes(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node dummy = new Node(-1);
        dummy.next = head;

        Node prev = dummy;

        while(head != null && head.next != null){

            Node first = head;
            Node second = head.next;

            //Updating links
            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
            head = first.next;

        }

        return dummy.next;
    }

 
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6};

        Node head = arrayToLinkedlist(arr);
        print(head);

        // head = swapNodeValues(head);
        // print(head);

        head = swapNodes(head);
        print(head);
    }
}
