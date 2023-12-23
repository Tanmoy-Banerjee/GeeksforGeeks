package GFG.LinkedList;

public class InsertAtPosition {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);


       print(insertAtPos(2,head,100));


    }

    public static Node insertAtPos(int pos, Node head, int data){
        Node current = head; int index = 0;
        Node node = new Node(data);
        while(current.next != null){

            if(index == pos){
                node.next = current.next;
                current.next = node;
                break;
            }
           current = current.next;
          index++;

        }

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
