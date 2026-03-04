 class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Q1_Add_TwoNums {

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

    //reverse list
    public static Node reverseList(Node head){

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

        return head;
    }

    //List are given in reversed order i.e, unit didit at first
    public static Node addTwoNums(Node head1, Node head2){

        //Optimized code

        // Approach 2 ( O(max(n1,n2)), space O(max(n1,n2)))

        Node result = new Node(0);      // Dummy node
        Node temp = result;

        Node n1 = head1;
        Node n2 = head2;

        int sum = 0;
        int carry = 0;
        int digit ;

        while(n1 != null || n2 != null){

            sum = carry;

            if(n1 != null) sum += n1.data;

            if(n2 != null) sum += n2.data;

            digit = sum % 10;
            carry = sum / 10;

            temp.next = new Node(digit);  //Creating and adding new digit node in linked list
            temp = temp.next;

            if(n1 != null) n1 = n1.next;

            if(n2 != null) n2 = n2.next;
        }

        if(carry != 0){
            temp.next = new Node(carry); 
        }

        return result.next;
    }

    // if lists are not reversed
    public static Node addTwoLists(Node head1, Node head2){

        head1 = reverseList(head1);
        head2 = reverseList(head2);
        
        Node sumList = addTwoNums(head1, head2);

        sumList = reverseList(sumList);

        return sumList;
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

   
    public static void main(String[] args) {

        // Reversed lists
        int [] arr1 = {3,5};    //represent 53
        int [] arr2 = {4,5,9,9};  // represent 9954

        Node head1 = arrayToLinkedlist(arr1);
        print(head1);

        Node head2 = arrayToLinkedlist(arr2);
        print(head2);

        Node result = addTwoNums(head1, head2);
        System.out.println("result1:");
        print(result);

        //Non reversed lists
         int [] arr3 = {5,3};    //represent 53
        int [] arr4 = {9,9,5,4};  // represent 9954

        Node head3 = arrayToLinkedlist(arr3);
        print(head3);

        Node head4 = arrayToLinkedlist(arr4);
        print(head4);

        Node result2 = addTwoLists(head3, head4);
        System.out.println("result2:");
        print(result2);

    }
}
