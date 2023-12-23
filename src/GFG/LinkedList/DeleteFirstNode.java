package GFG.LinkedList;

public class DeleteFirstNode {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);


          print(deleteFirstNode(head));


    }
       public static Node deleteFirstNode(Node head){

        if(head == null){
            return null;
        }
        else{
            head.data = head.next.data;
            head.next = head.next.next;
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
