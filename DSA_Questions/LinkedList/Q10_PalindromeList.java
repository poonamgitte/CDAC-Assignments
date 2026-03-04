// Check if list is palindrome or not

import java.util.Stack;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class Q10_PalindromeList{

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


    // Check is palindrome or not           TC - O(N)  SC - O(N/2)
    public static boolean isPalindrome(Node head)
    {
        if(head == null || head.next == null){
            return true;
        }

        Stack<Integer>stack = new Stack<>();

        int count = 0;

        Node temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        temp = head;

        for(int i=0; i<count/2; i++){

            stack.push(temp.data);
            temp = temp.next;
        }

        if(count % 2 != 0){
            temp = temp.next;
        }

        while(temp!= null){

            if(stack.isEmpty() || stack.pop() != temp.data){
                return false;
            }
            temp = temp.next;
        }

        return stack.isEmpty();
    }


    //Approach2     TC -        SC - O(1)

    public static Node reverse(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static boolean isPalindrome2(Node head){

        if(head == null || head.next == null){
            return true;
        }

        // Find middle of list
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node newHead = reverse(slow.next);

        Node first = head;
        Node second = newHead;

        while(second != null){

            if(first.data != second.data){
                slow.next = reverse(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        slow.next = reverse(newHead);
        return true;
    }

 
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,3,2,1};

        Node head = arrayToLinkedlist(arr);
        print(head);

        System.out.println("Is Palindrome:" + isPalindrome(head));

        //head = reverse(head);
        //print(head);

        System.out.println("Is palindrome:"+isPalindrome2(head));
    }
}
