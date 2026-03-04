// Linked list template 

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class A_LinkedListTemplate{

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


 
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6};

        Node head = arrayToLinkedlist(arr);
        print(head);

    }
}
