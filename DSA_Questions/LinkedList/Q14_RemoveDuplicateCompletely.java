// 82 remove duplicate completely from sorted list

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class Q14_RemoveDuplicateCompletely{

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

    // Remove duplicate completely

    public static Node removeDuplicate(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node dummyNode = new Node(-1);
        dummyNode.next = head;

        Node temp = dummyNode;

        while(temp.next != null && temp.next.next != null){

            if(temp.next.data == temp.next.next.data){
                int data = temp.next.data;

                while(temp.next != null && temp.next.data == data){
                    temp.next = temp.next.next;
                }
            }
            else{
                temp = temp.next;
            }
        }

        return dummyNode.next;
    }
 
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,3,4,4,5};

        Node head = arrayToLinkedlist(arr);
        print(head);

        head = removeDuplicate(head);
        print(head);

    }
}

