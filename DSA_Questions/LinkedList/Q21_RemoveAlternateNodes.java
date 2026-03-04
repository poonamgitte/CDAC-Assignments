// Delete alternate nodes from the list

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class Q21_RemoveAlternateNodes{

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


    // Delete alternate nodes       TC- O(n)  Sc - O(1)
    public static  Node deleteAlternate(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node temp = head;

        while(temp != null && temp.next != null){
            temp.next = temp.next.next;
            temp = temp.next;
        }

        return head;
    }

 
    public static void main(String[] args) {
        
        int [] arr = {1,2};

        Node head = arrayToLinkedlist(arr);
        print(head);

        head = deleteAlternate(head);
        print(head);

    }
}
