package LeetCode.Top150.LinkedList;

import java.util.ArrayList;

public class LeetCode203 {

    public ListNode removeElements(ListNode head, int val) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode curr = head;
        while (curr != null){
            if(curr.val != val)
                arrayList.add(curr.val);
            curr = curr.next;
        }

        int i = 0;
        curr =new ListNode(0);

        ListNode node = curr;

        while (i< arrayList.size()){
            node.next = new ListNode(arrayList.get(i));
            i++;
            node = node.next;
        }

        return curr.next;
    }
}
