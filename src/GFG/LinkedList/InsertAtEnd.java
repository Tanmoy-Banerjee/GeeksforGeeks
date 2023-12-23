package GFG.LinkedList;

public class InsertAtEnd {


    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);


        print(insertAtEnd(head,100));


    }

    public static Node insertAtEnd(Node head, int x){

        Node node = new Node(x);
        if(head == null){
            return node;
        }else{

            Node curr = head;
            while(curr.next != null){
                 curr = curr.next;
            }
            curr.next = node;
            node.next = null;

            return head;

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
