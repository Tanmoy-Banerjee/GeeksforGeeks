package GFG.LinkedList;

public class DeleteLastNodeofLinkedList {


    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);


        print(deleteLastNodeofLL(head));


    }

    public static Node deleteLastNodeofLL(Node head){
        Node current = head;

        while(current.next.next != null ){
            current=current.next;
        }

        current.next = null;
        return head;
    }
    public static void print(Node head){

        Node node = head;
        while(node !=  null){

            System.out.println(node.data);
            node = node.next;

        }
    }
}
