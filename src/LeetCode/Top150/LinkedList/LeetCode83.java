package LeetCode.Top150.LinkedList;

import DoublyLinkedList.Node;

import java.util.ArrayList;
import java.util.Collections;

public class LeetCode83 {

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;
        ArrayList<Integer> arrayList= new ArrayList<>();

        while (curr != null){
              if(arrayList.contains(curr.val) == false){
                  arrayList.add(curr.val);
                  curr = curr.next;
              }else{
                  curr = curr.next;
              }
        }
        Collections.sort(arrayList);
        ListNode temp = new ListNode(0);
        ListNode node = temp;
        int i = 0;
         while (i < arrayList.size()){
             node.next = new ListNode(arrayList.get(i));
             node = node.next;
             i++;
        }


        return  temp.next;

    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);
        list1.next.next.next.next.next = new ListNode(5);

        ListNode head = deleteDuplicates(list1);
        traverse(head);

    }


    public static void  traverse(ListNode head){

        ListNode curr = head;

        while (curr != null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
    }
}
