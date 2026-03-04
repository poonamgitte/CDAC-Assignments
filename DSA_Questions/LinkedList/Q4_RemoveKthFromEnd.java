
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class Q4_RemoveKthFromEnd {
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

    //Remove Kth element from end
    public static Node removeKth(Node head, int k){

        if(head == null){
            return head;
        }

        if(k <= 0){
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
        
        temp = head;

        int cntK = 0;
         
        while(temp != null){

            cntK++;

            if(count - cntK == k){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }

        return head;
    }


    public static void main(String[] args) {
         int [] arr = {1,2,3,4,5,6};

        Node head = arrayToLinkedlist(arr);

        print(head);

        int k = 6;
        head = removeKth(head, k);
        print(head);

    }
    
}
