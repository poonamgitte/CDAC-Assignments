// Merge two sorted lists

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class Q7_MergeSortedLists{

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

    //Merge two lists           TC - O(M+N) SC- O(1)
    public static Node mergeLists(Node list1, Node list2){

        if(list1 == null && list2 == null){
            return null;
        }

        if(list1 == null) 
            return list2;

        if(list2 == null)
            return list1;

        Node dummyNode = new Node(-1);

        Node temp = dummyNode;

        while(list1 != null && list2 != null){

            if(list1.data <= list2.data){
                temp.next = list1;
                list1 = list1.next;
            }
            else if(list1.data > list2.data){
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

        return dummyNode.next;
    }


 
    public static void main(String[] args) {
        
        int [] arr1 = {1,2,4};
        int [] arr2 = {1,3,4};

        Node head1 = arrayToLinkedlist(arr1);
        print(head1);

        Node head2 = arrayToLinkedlist(arr2);
        print(head2);

        head1 = mergeLists(head1, head2);
        print(head1);

    }
}
