// LeetCode 83 remove duplicate elements from sorted list

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class Q13_RemoveDuplicateFromSortedlist {

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

    //Remove duplicate elements     TC - O(N)  SC- O(1)
    public static Node removeDuplicate(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node temp = head;

        while(temp.next != null){

            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }

        return head;
    }


 
    public static void main(String[] args) {
        
        int [] arr = {1,1,2,3,3,4,4,5};

        Node head = arrayToLinkedlist(arr);
        print(head);

        head = removeDuplicate(head);
        print(head);

    }
}
