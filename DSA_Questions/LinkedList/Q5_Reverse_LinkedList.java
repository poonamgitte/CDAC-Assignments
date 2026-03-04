
import java.util.Stack;

// Reverse the list

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class Q5_Reverse_LinkedList {

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

    //Reverse list

    // Approach 1   Tc- O(n) Sc- O(n)
    public static Node reverse(Node head){

        Stack<Integer>stack = new Stack<>();

        Node temp = head;

        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while(!stack.isEmpty()){

            temp.data = stack.pop();
            temp = temp.next;
        }

        return head;
    }

    //Approach 2  Tc- O(n) Sc - O(1)
    public static Node reverse2(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    //Approach3 Recursive
    public static Node reveseRecursive(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reveseRecursive(head.next);

        Node newFront = head.next;

        newFront.next=head;
        head.next = null;

        return newHead;
    }


 
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6};

        Node head = arrayToLinkedlist(arr);
        print(head);

        // Approach 1
        // head = reverse(head);
        // print(head);

        //Approach 2
        head = reverse2(head);
        print(head);
    }
}
