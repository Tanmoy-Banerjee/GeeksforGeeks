package LeetCode.Top150.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LeetCode206 {


    public ListNode reverseList(ListNode head) {


        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode curr = head;
        while (curr != null){
            arrayList.add(curr.val);
            curr = curr.next;
        }
        int i = arrayList.size()-1;
        curr =new ListNode(0);
        ListNode node = curr;
        while (i>=0){
            node.next = new ListNode(arrayList.get(i));
            node = node.next;
            i--;
        }

        return curr.next;
    }
}
