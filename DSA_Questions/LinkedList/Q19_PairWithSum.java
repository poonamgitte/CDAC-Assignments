// Find all pairs with given sum in sorted linkedlist

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public class Q19_PairWithSum {

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

    // print DLL
    public static void print(Node head){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    // Approach1 Bruteforce
    // TC -  O(n^2)      SC - O(1)
    public static List<List<Integer>> pairWithSum(Node head, int sum){

        if(head == null){
            return null;
        }

        List<List<Integer>>list = new ArrayList<>();

        Node temp1 = head; 

        while(temp1 != null){

            Node temp2 = temp1.next;

            while(temp2 != null && temp1.data + temp2.data <= sum){
                
                if(temp1.data + temp2.data == sum){

                    list.add(Arrays.asList(temp1.data,temp2.data));
                }

                temp2 = temp2.next;
            }
           
            temp1 = temp1.next;
        }

        return list;
    }

    // Approach 2
    // TC - O(2n)   sc - O(1)
    public static Node getTail(Node head){

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        return temp;
    }

    public static List<List<Integer>> pairWithSum2(Node head, int sum){

        List<List<Integer>>list = new ArrayList<>();
        

        Node left = head;
        Node right = getTail(head);   //O(n)

        while(left.data < right.data){         //O(n)

            if(left.data + right.data == sum){
                list.add(Arrays.asList(left.data,right.data ));
                left = left.next;
                right = right.prev;
            }
            else if(left.data + right.data > sum){
                right = right.prev;
            }
            else{

                left = left.next;
            }
        }

        return list;
    }

     public static void main(String[] args) {
         int [] arr = {1,2,3,4,5,6};

         //Array to DLL
         //Way 1
         Node head = arrayToDLL(arr);
         print(head);

         System.out.println(pairWithSum(head, 5));

          System.out.println(pairWithSum2(head, 5));
     }

}
