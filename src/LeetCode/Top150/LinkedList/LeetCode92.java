package LeetCode.Top150.LinkedList;

import java.util.ArrayList;

public class LeetCode92 {


    public static ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode curr = head;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(curr != null){
            arrayList.add(curr.val);
            curr = curr.next;
        }


        left = left-1;
        right = right-1;
        for (int i = left; i< right; i++){
              int temp = arrayList.get(i);
              arrayList.set(i, arrayList.get(right));
              arrayList.set(right, temp);
              right--;
        }

     //   System.out.println(arrayList);

       int i = 0;

       curr = new ListNode(0);
       ListNode node = curr;
       while (i < arrayList.size()){
           node.next = new ListNode(arrayList.get(i));
           node = node.next;
           i++;
       }

      return  curr.next;

    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
       list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        //list1.next.next.next.next = new ListNode(5);
     //   list1.next.next.next.next.next = new ListNode(5);

        ListNode head = reverseBetween(list1,1,4);
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
