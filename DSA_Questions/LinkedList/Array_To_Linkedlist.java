// Array to linked list conversion


class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class Array_To_Linkedlist {

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

    //Traversing 

    public static int traverse(Node head){

        Node temp = head;

        int length =0;

        while(temp != null){

            length++;
            System.out.print(temp.data+"->");
            temp = temp.next;
        }

        return length;
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


    //Search
    public static boolean search(Node head, int data){
        Node temp = head;

        while(temp != null){
           
            if(temp.data == data)
                return true;
            temp = temp.next;
        }

        return false;
    }

    //Delete head node
    public static Node deleteHead(Node head){

        if(head == null) 
            return head;

        head = head.next;

        return head;
    }

    //Delete tail node
    public static Node deleteTail(Node head){

        if(head == null || head.next == null)
            {return null;}

        Node temp = head;

        while((temp.next.next) != null){
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    //Delete kth node
    public static Node deleteKth(Node head, int position ){

        if(head == null )
            return head;

        if(position == 1){
            head = head.next;
            return head;
        }

        Node temp = head;

        for(int i=1; i<position-1;i++){
            temp = temp.next;
        }

        if(temp == null || temp.next == null){
            return head;
        }

        temp.next = temp.next.next;

        return head;
    }

    //Delete by value
    public static Node deleteValue(Node head, int value){

        if(head == null){
            return head;
        }

        if(head.data == value){
            head = head.next;
            return head;
        }

        Node temp = head;

        while(temp.next != null){

            if(temp.next.data == value){
                temp.next = temp.next.next;
                break;
            }

            temp = temp.next;
        }

        return head;
    }

    //Insert at first
    public static Node insertFirst(Node head, int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return head;
        }

        newNode.next = head;
        head = newNode;
        return head;
    }


    //Insert last
    public static Node insertLast(Node head,int data){

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return head;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    // Insert at Kth position
    public static Node insertKthNode(Node head, int pos, int data){

        if(pos < 0){
            return head;
        }

        Node newNode = new Node(data);

        if(pos == 1){
            if(head == null){
                return newNode;
            }
            else{
                newNode.next = head;
                return newNode;
            }
        }

        Node temp = head;

        for(int i=1; i<pos-1;i++){
            temp = temp.next;
        }

        if(temp == null){
            return head;
        }

        if( temp.next == null){
            temp.next = newNode;
        }
        else{

            newNode.next = temp.next;
            temp.next = newNode;
        }

        return head;
    }

    //Insert before value

    public static Node insertBeforeValue(Node head, int value, int data){

        if(head == null ){
            return head;
        }

        Node newNode = new Node(data);

        if(head.data == value){
            newNode.next = head;
            return newNode;
        }

        Node temp = head;

        while(temp.next != null){

            if(temp.next.data == value){
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }

            temp = temp.next;
        }

        return head;

    }

    //Insert at middle of linked list (GFG)
    public static Node insertInMiddle(Node head, int x) {
        // Code here
        Node newNode = new Node(x);
        
        if(head == null){
            return newNode;
        }
        
        Node slow = head;
        Node fast = head;
        
        while(fast.next != null && fast.next.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
        }
        
         newNode.next = slow.next;
         slow.next = newNode;
         
        return head;
    }

    
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6};
        int element = 5;

        Node head = arrayToLinkedlist(arr);

        System.out.println("Head:"+head.data);

        int length = traverse(head);

        System.out.println("\nLength of linked list:"+length);

        System.out.println("Search:"+search(head, element));

        // delete head
        System.out.println("delete head:");
        head = deleteHead(head);
        print(head);

        // delete tail
        System.out.println("delete tail:");
        head = deleteTail(head);
        print(head);

        // delete kth

        int pos = 5;
        System.out.println("delete kth:"+pos);
        head = deleteKth(head, pos);
         print(head);

       // delete by value

       int value = 3;
        System.out.println("delete by value:"+value);
       head = deleteValue(head, value);
       print(head);

        // Insert first
        System.out.println("Insert first:");
        head = insertFirst(head, 10);
        print(head);

        // Insert last
        System.out.println("Insert Last:");
        head = insertLast(head, 11);
        print(head);

        //Insert Kth position
        System.out.println("Insert Kth:");
        head = insertKthNode(head,5, 22);
        print(head);

        // after value
        System.out.println("Insert after value:");
        head = insertBeforeValue(head,11, 100);
        print(head);

        //Insert at middle(GFG)
        head = insertInMiddle(head, 33);
         print(head);

    }
}
