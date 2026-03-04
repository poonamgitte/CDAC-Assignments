//Chek if there is cycle in linked list

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class Q8_CheckCycleInList{

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

    public static boolean hasCycle(Node head) {

        // Approach 1

        // Set<Node> set = new HashSet<>();

        // Node curr = head;

        // while(curr != null){

        //     if(set.contains(curr)){
        //         return true;
        //     }

        //     set.add(curr);
        //     curr = curr.next;
        // }

        // return false;

        //Approach 2: Floyd’s Tortoise-Hare algorithm

        if(head == null)
            return false;

        Node slow = head;
        Node fast = head.next;

        while(slow != fast){
            
            if(fast == null || fast.next==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    //Return the start of cycle
    public static Node detectCycle(Node head){

        if(head == null || head.next == null){
            return null;
        }

        boolean isCycle = false;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                isCycle = true;
                break;
            }

        }

        if(!isCycle) return null;

        slow = head;

        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }


 
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4};

        Node head = arrayToLinkedlist(arr);
        print(head);

        head.next.next.next = head.next;

        System.out.println("Is there cycle: "+hasCycle(head));

        // Cycle start
        head = detectCycle(head);
        print(head);

    }
}

