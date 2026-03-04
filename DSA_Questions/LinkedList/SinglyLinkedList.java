// Singly linked list
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{

    Node head;

    void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return ;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void printList(){

        if(head == null){
            System.out.println("List is empty");
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }

        System.out.print("null\n");
    }

    void delete(int position){

        if(position < 1 ){
            System.out.println("Invalid position");
            return;
        }

        // if only one node
        if (position == 1 && head == null || head.next == null){
            head = null;
            return ;
        }
        
        // delete first node
        if(position == 1){
            head = head.next;
        }
        else{

            Node temp = head;
            for(int cnt = 1; cnt < position-1; cnt++){
                temp = temp.next;
            }


            if(temp == null){
                System.out.println("Invalid position");
            }
            else if(temp.next.next == null){
                temp.next = null;
            }
            else{

                temp.next = temp.next.next;
            }
           
        }


    }

    void reverseList(){

        // if (head == null){
        //     return;
        // }

        // Node temp = head;
        // Node nextNode = temp.next;

        // temp.next = null;

        // while(nextNode != null) {

        //     Node currNode = temp;
        //     temp = nextNode;
        //     nextNode = temp.next;
        //     temp.next = currNode;
        // }

        // head = temp;

        // Using 3 pointer

        Node prev = null;
        Node curr = head ;
        Node next ;

        while(curr != null){
            next = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = next;
        }

        head = prev;

    }
}

public class SinglyLinkedList{

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.printList();

        //list.reverseList();

        list.delete(2);
        list.printList();
        
    }
}