
// Remove Nth node from end of linked list

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class Q6_RemoveNthNodeFromLast{

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

    //approach 1    TC - O(N) +O(k)
    public static Node removeNth1(Node head, int k){

        if(head == null){
            return head;
        }

        int count = 0;
        Node temp = head;

        while(temp != null){

            count++;
            temp = temp.next;
        }

        if(count == k){
            return head.next;
        }

        int cnt = count - k;

        temp = head;

        for(int i=1; i<cnt; i++){
            temp = temp.next;
        }

        if(temp != null && temp.next != null){
            temp.next = temp.next.next;
        }

        return head;
    }

    //Approach 2

    public static Node removeNth2(Node head, int k){
        if(head == null){
            return head;
        }

        Node slow = head;
        Node fast = head;

        for(int i=0; i<k; i++){
            fast = fast.next;
        }

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
        
        int [] arr = {1,2,3,4,5,6};

        Node head = arrayToLinkedlist(arr);
        print(head);

        //approach1 
        // head = removeNth1(head, 4);
        // print(head);

        //Approach2
        head = removeNth2(head, 4);
        print(head);

    }
}
