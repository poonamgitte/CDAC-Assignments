// Leetcode 61 Rotate list

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class Q16_RotateList{

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

    // Rotate right by k
    // TC - O(2n)  SC - O(1)
    public static Node rotate(Node head, int k){

        if(head == null || k == 0){
            return head;
        }

        Node temp = head;

        int count =0;

        while(temp != null){
            count++;
            temp = temp.next;
        }


        k = k%count;    // if k is greater than list size

          if(k == 0){
            return head;
        }

        Node slow = head;
        Node fast = head;

        for(int i=0; i<k; i++){
            fast = fast.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        Node newHead = slow.next;
        slow.next = null;
        fast.next = head;

        return newHead;
    }

    //Approach 2 
    // TC - O(2n)  SC - O(1)

    public static Node rotateClassic(Node head, int k){

        if(head == null){
            return head;
        }

        Node temp = head;
        int count = 1;

        while(temp.next != null){
            count++;
            temp = temp.next;
        }

        k = k%count;

        // if k is 0 or k = count
        if(k == 0){
            return head;
        }

        temp.next = head;  // making list circular

        Node newTail = head;
        for(int i=1; i<count-k; i++){
            newTail = newTail.next;
        }

        head = newTail.next;
        newTail.next = null;

        return head;
    }

 
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6};

        Node head = arrayToLinkedlist(arr);
        print(head);

        int k=3;
        // head = rotate(head, k);
        // print(head);

        head = rotateClassic
        (head, k);
        print(head);


    }
}
