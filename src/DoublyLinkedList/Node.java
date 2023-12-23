package DoublyLinkedList;

public class Node {

    int data;
    Node prev;
    Node next;


    Node(int x){

        data = x;
        prev = null;
        next = null;
    }

}


class Test{

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
    }
}