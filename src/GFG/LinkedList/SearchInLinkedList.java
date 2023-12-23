package GFG.LinkedList;

public class SearchInLinkedList {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);


       // print(deleteLastNodeofLL(head));

        System.out.println(search(head,30));

    }

    public static int search(Node head, int val){

        Node current = head;
        int i = 0; int flag = -1;
        while(current.next != null){
            if(current.data == val){
                flag = 1;
                return  i;

            }else{
                current = current.next;
                i++;
            }

        }

        return -1;
    }

    public static void print(Node head){

        Node node = head;
        while(node !=  null){

            System.out.println(node.data);
            node = node.next;

        }
    }
}
