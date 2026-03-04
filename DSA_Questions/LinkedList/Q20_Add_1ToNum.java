// Add one to number precented in list

public class Q20_Add_1ToNum {

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

    // Reverse list
    public static Node reverseList(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node prev = null;
        Node current = head;
        Node next = null;


        while(current != null){

            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // Approach 1    TC - O(3n)  SC - O(n)
    // Add 1 to number      
    // -> 1-> 5-> 9  +  1  = 160
    public static Node addOneToNum(Node head){

        if(head == null){
            return head;
        }

        Node newHead = reverseList(head);

        Node result = new Node(0);
        Node tempResult = result;


        Node temp = newHead;

        int sum = 0;
        int carry = 1;

        while(temp!= null){

            sum = temp.data + carry;

            int digit = sum % 10;
            
            carry = sum/10;

            tempResult.next = new Node (digit);

            tempResult = tempResult.next;

            temp = temp.next;

        }

        if(carry != 0){
            tempResult.next = new Node(carry);
        }

        result = reverseList(result.next);
        return result;
    }


    // Approach 2       TC - O(3n)   SC - O(1)

    public static Node addOneToNum2(Node head){

        if(head == null){
            return head;
        }

        Node newHead = reverseList(head);

        Node temp = newHead;

        int sum = 0;
        int carry = 1;

        while(temp!= null){

            sum = temp.data + carry;

            int digit = sum % 10;
            
            carry = sum/10;

            temp.data = sum % 10;
            carry = sum / 10;

            if(carry == 0){
                break;
            }

            // If at last carry remaining new digit added
            if(temp.next == null && carry > 0){
                temp.next = new Node(carry);
            }
            temp = temp.next;

        }

        head = reverseList(newHead);

        return head;
    }


 
    public static void main(String[] args) {
        
        int [] arr = {1,5,9};

        Node head = arrayToLinkedlist(arr);
        print(head);

        // Approach 1
       // head = addOneToNum(head);

        // Approach 2
        head = addOneToNum2(head);
        print(head);

    }
}
