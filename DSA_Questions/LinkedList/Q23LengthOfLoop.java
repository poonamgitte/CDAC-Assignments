// Find length of loop 

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class  Q23LengthOfLoop {

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


    // Length of loop
    public static int lengthOfLoop(Node head){

        if(head == null){
            return 0;
        }

        Node slow = head;
        Node fast = head;

        while(slow != fast){

            if(fast == null || fast.next == null){
                return 0;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        int cnt = 0 ;
        fast = fast.next;

        while(slow != fast){
            cnt++;
            fast = fast.next;
        }

        return cnt;
    }


 
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4};

        Node head = arrayToLinkedlist(arr);
        print(head);

        head.next.next.next.next = head.next;

        System.out.println("Loop length : "+ lengthOfLoop(head));

    }
}
