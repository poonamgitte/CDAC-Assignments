// Sort linked lists using merge sort 

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class Q22_SortList_MergeSort {

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

    public static Node mergeSort(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node middle = findMiddle(head); 
        
        Node list1 = head;
        Node list2 = middle.next;
        middle.next = null;

        // Divide list in subparts till single element
        
        list1 = mergeSort(list1);
        list2 = mergeSort(list2);
        return merge(list1, list2);  // merge divided lists
    }

    // Function to merge to lists
    public static Node merge(Node list1, Node list2){


        // if(list1 == null && list2 == null){
        //     return null;
        // }

        if(list1 == null){
            return list2;
        }

        if(list2 == null){
            return list1;
        }

        Node dummy = new Node(0);
        Node temp = dummy;

        while(list1 != null && list2 != null){

            if(list1.data < list2.data){
                temp.next = list1;
                list1 = list1.next;
            }
            else if(list1.data >= list2.data){
                temp.next = list2;
                list2 = list2.next;
            }

            temp = temp.next;
        }

        if(list1 != null){
            temp.next = list1;
        }
        
        if(list2 != null){
            temp.next = list2;
        }

        return dummy.next;
    }

    // Function to find middle of list
    public static Node findMiddle(Node head){

        if(head == null){
            return null;
        }

        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
 
    public static void main(String[] args) {
        
        int [] arr = {5,2,4,3,1,6};

        Node head = arrayToLinkedlist(arr);
        print(head);

        Node middle = findMiddle(head);
        System.out.println(middle.data);

        head = mergeSort(head);
        
        print(head);

    }
}
