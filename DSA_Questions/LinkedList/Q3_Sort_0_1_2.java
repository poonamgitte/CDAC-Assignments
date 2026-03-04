class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Q3_Sort_0_1_2 {

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

    //Sort 0 1 2 Approach1 brute force  TC- O(2n)
    public static Node sort012(Node head){

        if(head == null || head.next == null){
            return head;
        }

        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        Node temp = head;

        while(temp != null){

            if(temp.data == 0){
                cnt0++;
            }
            else if(temp.data == 1){
                cnt1++;
            }
            else if(temp.data == 2){
                cnt2++;
            }

            temp = temp.next;
        }

        temp = head;

        while(temp != null){

            if(cnt0 != 0){
                temp.data = 0;
                cnt0--;
            }
            else if(cnt1 != 0){
                temp.data = 1;
                cnt1--;
            }
            else if(cnt2 != 0){
                temp.data = 2;
                cnt2--;
            }
            temp =temp.next;
        }
        return head;
    }

    //Approach 2  TC- O(n)
    public static Node sort012A2(Node head){

        if(head == null || head.next == null){
            return head;
        }

        //Dummy nodes
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node temp0 =  zeroHead;
        Node temp1 = oneHead  ;
        Node temp2 =  twoHead ;

        Node temp = head;

        while(temp != null){

            if(temp.data == 0){
                temp0.next = temp;
                temp0 = temp0.next;
            }
            else if (temp.data == 1){
                temp1.next = temp;
                temp1 = temp1.next;
            }
            else if(temp.data == 2){
                temp2.next = temp;
                temp2 = temp2.next;
            }

            temp = temp.next;
        }

        temp0.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        temp1.next = twoHead.next;
        temp2.next = null;

        return zeroHead.next;
    }


    public static void main(String[] args) {
         int [] arr = {0,0,0};

        Node head = arrayToLinkedlist(arr);

        print(head);

        //Sort 0 1 2 approach 1
        // head = sort012(head);
        // print(head);

        head = sort012A2(head);
        print(head);

    }
}
