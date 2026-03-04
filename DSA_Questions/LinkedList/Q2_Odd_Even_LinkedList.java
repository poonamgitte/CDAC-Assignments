import java.util.*;
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Q2_Odd_Even_LinkedList {

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
    // Even odd array segregation
    
    // brute force approach  TC- O(2n) SC- O(n)
    public static Node evenOddSegregation(Node head){

        if(head == null || head.next == null){
            return head;
        }
        
        ArrayList<Integer> arr = new ArrayList<>();

        Node temp = head;

        while(temp != null && temp.next != null){
            
            arr.add(temp.data);
            
            temp = temp.next.next;
        }

        if(temp != null) 
            arr.add(temp.data);

        temp = head.next;

        while(temp != null && temp.next != null){

            arr.add(temp.data);

            temp = temp.next.next;
        }

        if(temp != null){
            arr.add(temp.data);
        }

        temp = head;

        for(int i=0; i<arr.size(); i++){

            temp.data = arr.get(i);

            temp = temp.next;
        }

        return head;
        
    }

    //Even odd segregation approach 2
    public static Node evenOddSegregation2(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;

        while( even != null && even.next != null ){

            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        
        odd.next = evenHead;

        return head;
    }


    public static void main(String[] args) {
         int [] arr = {1,2,3,4,5,6};
        int element = 5;

        Node head = arrayToLinkedlist(arr);

        print(head);

        // head = evenOddSegregation(head);
        // print(head);

        head = evenOddSegregation2(head);
        print(head);

    }
}
