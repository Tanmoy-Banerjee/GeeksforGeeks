package CodingInterview.IBMInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseSinglyLinkedList {

    public static  Node reverseLinkedList(Node head){

        Node curr = head;
        ArrayList<Integer> arrayList = new ArrayList<>();

        while(curr != null){
            arrayList.add(curr.data);
            curr = curr.next;
        }

        Collections.reverse(arrayList);
        head = new Node(arrayList.get(0));
        Node temp = head;
        int i = 1;
        while (i<arrayList.size()){
            curr = new Node(arrayList.get(i));
            i++;
            temp.next = curr;
            temp = curr;
        }
       // System.out.println(arrayList);

        return head;
    }

    public  static void traverse(Node head){

        Node curr = head;

        while (curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);

        Node node = reverseLinkedList(head);

        traverse(node);
    }


}
