package GFG.LinkedList;

public class RecursiveTraversal {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);


        recursiveTraversal(head);

    }

    public static void recursiveTraversal(Node head){

        if(head == null) {
            return;
        }
        else{
            System.out.println(head.data);
            recursiveTraversal(head.next);
        }
    }


}
