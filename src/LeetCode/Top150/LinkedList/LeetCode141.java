package LeetCode.Top150.LinkedList;

import java.util.HashSet;

public class LeetCode141 {

    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();

        ListNode curr = head;
        boolean flag = false;
        while(curr != null){
            if(set.contains(curr)){
                return  true;
            }
            set.add(curr);
            curr = curr.next;
        }


            return  flag;
    }
}
