package LeetCode.Top150.LinkedList;

import DoublyLinkedList.Node;

import java.util.ArrayList;
import java.util.Collections;

public class LeetCode21 {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

       // System.out.println("It rwaches this function"+ list1.val + " " +list2.val);
        ArrayList<Integer> arrayList = new ArrayList<>();

        ListNode curr = list1;

        while(curr != null){

         //   System.out.println("List 1 values = "+curr.val);
            arrayList.add(curr.val);
            curr = curr.next;
        }

        curr = list2;

        while(curr != null){
            arrayList.add(curr.val);
            curr = curr.next;
        }

        Collections.sort(arrayList);



        int i = 0;

         curr = new ListNode(0);
         ListNode node = curr;
        while (i< arrayList.size()){
          //  System.out.println("value entered is = " + arrayList.get(i));
            node.next  = new ListNode(arrayList.get(i));
            i++;
            node = node.next;
        }
        node.next = null;



    return  curr.next;
    }


    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        //list1.next.next.next = null;

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);


      ListNode head = mergeTwoLists(list1, list2);
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
