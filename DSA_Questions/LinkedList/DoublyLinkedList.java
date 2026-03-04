
class Node{
    int data ;
    Node next;
    Node prev;

    public Node(int data, Node next, Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    } 

    public Node(int data){
        this.data = data;
        next = null;
        prev = null;
    }

} 
public class DoublyLinkedList {

    //Array to doubly linked list
    public static Node arrayToDLL(int arr[]){

        Node head = new Node(arr[0]);

        Node prev = head;

        for(int i=1; i<arr.length; i++){
            Node newNode = new Node(arr[i], null, prev);

            prev.next = newNode;
            prev = newNode;
        }

        return head;
    }

    // Or
     public static Node arrayToDLL2(int arr[]){

        Node head = new Node(arr[0]);

        Node temp = head;

        for(int i=1; i<arr.length; i++){
            Node newNode = new Node(arr[i]);

            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }

        return head;
    }

    // print DLL
    public static void print(Node head){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    //Delete head 
    public static Node deleteFirst(Node head){

        //If list empty or only one node
        if(head == null || head.next == null){
            return null;
        }

        Node temp = head;
    
        head =head.next;
        head.prev = null;
        temp.next = null;

        return head;

    }

    //Delete tail
    public static Node deleteTail(Node head){

        if(head == null || head.next == null){
            return null;
        }

        Node temp = head;

        while(temp.next.next != null){
            
            temp = temp.next;
        }

        temp.next.prev = null;
        temp.next = null;

        return head;
    }

    //Delete Kth node
    public static Node deleteKth(Node head, int k){

        if(head == null){
            return null;
        }

        int cnt = 0;

        Node kNode = head;

        while(kNode != null){
            cnt++;

            if(cnt == k) 
                break;

            kNode = kNode.next;
        }

        Node kPrev = kNode.prev;
        Node kNext = kNode.next;

        // If only one node
        if(kPrev == null && kNext == null){
            return null;
        }

        // if head node
        else if(kPrev == null){
            return deleteFirst(head);
        }

        //If last node
        else if(kNext == null){
            return deleteTail(head);
        }

        kPrev.next = kNext;
        kNext.prev = kPrev;

        kNode.next = null;
        kNode.prev = null;

        return head;

    }

    // delete given node except head
    public static void deleteNode(Node temp){

        Node tempPrev = temp.prev;
        Node tempNext = temp.next;

        if(tempNext == null){
            tempPrev.next = null;
            temp.prev = null;
            return;
        }

        tempPrev.next = tempNext;
        tempNext.prev = tempPrev;

        temp.next = null;
        temp.prev = null;
        
    }

    //Insert before head
    public static Node insertBeforeHead(Node head, int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return head;
        }

        newNode.next = head;
        head.prev = newNode; 

        head = newNode;

        return head;

    }

    //Insert before tail
    public static Node insertBeforeTail(Node head, int data){

       if(head == null || head.next == null){
            return insertBeforeHead(head, data);
       }

       Node newNode = new Node(data);
       Node temp = head;

       while(temp.next.next != null){
            temp = temp.next;
       }

       Node tempNext = temp.next;

       newNode.next = tempNext;
       tempNext.prev = newNode;
       
       newNode.prev  = temp;
       temp.next = newNode;

       return head;
    }

    //Insert before kth element
    public static Node insertBeforeKth(Node head, int data, int k){

         if(k==1){
            return insertBeforeHead(head, data);
        }

        Node temp = head;
        int cnt =0;

        while(temp != null){
            cnt++;

            if(cnt == k){
                break;
            }
            temp = temp.next;
        }

        
        Node kPrev = temp.prev;
        Node newNode = new Node(data,temp,kPrev);

        kPrev.next = newNode;
        temp.prev = newNode;

        return head;

    }

    //Insert before kth except head
    public static void insertBeforeTarget(Node temp, int data){

        Node newNode = new Node(data,temp , temp.prev);

        temp.prev.next = newNode;
        temp.prev = newNode;
    }

    //Reverse Doubly linked list
    public static Node reverseDLL(Node head){

        // if(head == null || head.next == null){
        //     return head;
        // }

        // Node prev = null;
        // Node curr = head;
        // Node next ;

        // while(curr != null){
        //     next = curr.next;
        //     curr.next = prev;
        //     curr.prev = next;
        //     prev = curr;
        //     curr = next;
        // }

        // head = prev;
        // return head;

        // Above solution leads to loop

        if(head == null || head.next == null){
            return head;
        }

        Node prev = null;
        Node curr = head;

        while(curr != null){
            Node temp = curr.next;
            curr.next = curr.prev ;
            curr.prev = temp;

            prev = curr;

            curr = curr.prev; // next is assigned at prev
        }

        return prev;
    }

    public static void main(String[] args) {
         int [] arr = {1,2,3,4,5,6};

         //Array to DLL
         //Way 1
         Node head = arrayToDLL(arr);
         print(head);

         //way 2
         Node head2 = arrayToDLL2(arr);
         print(head2);

        // Delete first
        System.out.println("delete first:");
        head = deleteFirst(head);
        print(head);

        //Delete last
        System.out.println("delete last:");
        head = deleteTail(head);
        print(head);

        //Delete kth
        System.out.println("delete Kth:");
        head = deleteKth(head, 3);
        print(head);

        // delete given node except head
        System.out.println("delete given:");
        deleteNode(head.next.next);
        print(head);

        //Insert first
        System.out.println("Insert first:");
        head = insertBeforeHead(head, 10);
        print(head);

        // Insert before tail
        System.out.println("Insert before tail");
        head = insertBeforeTail(head, 100);
        print(head);

        //Insert before kth node
        System.out.println("Insert brefore kth node");
        int data = 22;
        int k = 2;
        head = insertBeforeKth(head,data , k);
        print(head);

        // Insert before given target except head
        insertBeforeTarget(head.next.next.next, 33);
        print(head);


        //Reverse DLL
        head = reverseDLL(head);
        System.out.println("Reversed DLL: ");
        print(head);

    }



}
