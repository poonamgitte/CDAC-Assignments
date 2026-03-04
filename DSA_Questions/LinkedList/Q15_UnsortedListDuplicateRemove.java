// Remove duplicates from unsorted list

import java.util.HashSet;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class Q15_UnsortedListDuplicateRemove{

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

    //Remove duplicates from unsorted list
    // TC - O(n)    SC- O(n)-> hash set used 
    public static Node removeDuplicate(Node head){

        if(head == null || head.next == null){
            return head;
        }

        HashSet<Integer> set = new HashSet<>();

        Node temp = head;

        //Add first node data
        set.add(head.data);

        while(temp.next != null){

            if(set.contains(temp.next.data)){
                temp.next = temp.next.next;
            }
            else{
                set.add(temp.next.data);
                temp = temp.next;
            }
        }

        return head;
    }

 
    public static void main(String[] args) {
        
        int [] arr = {1,2,1,3,4,2,5,6,5};

        Node head = arrayToLinkedlist(arr);
        print(head);

        head = removeDuplicate(head);
        print(head);

    }
}
