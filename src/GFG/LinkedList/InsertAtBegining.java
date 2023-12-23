package GFG.LinkedList;

public class InsertAtBegining {


    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);



        print(insertAtBegin(5,head));

    }

    public static Node insertAtBegin(int x, Node head){

        if(head == null){
            head.data = x;
            head.next = null;
            return head;
        }else {

            Node node = new Node(x);
            node.next = head;
            return node;
        }

    }

    public static void print(Node head){

        Node node = head;
        while(node !=  null){

            System.out.println(node.data);
            node = node.next;

        }
    }
}
