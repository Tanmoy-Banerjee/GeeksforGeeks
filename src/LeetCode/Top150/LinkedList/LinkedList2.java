package LeetCode.Top150.LinkedList;

import java.math.BigInteger;

import static java.lang.String.*;

public class LinkedList2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s = new StringBuilder();
        StringBuilder s1 = new StringBuilder();

        ListNode curr = l1;

        while (curr != null){
            s = s.append(curr.val);
            curr = curr.next;
        }
        curr = l2;
        while (curr != null){
            s1 = s1.append(curr.val);
            curr = curr.next;
        }

        BigInteger sum = new BigInteger(String.valueOf(s.reverse())).add(new BigInteger(String.valueOf(s1.reverse())));
        String s3 = sum.toString();

        StringBuilder sumString = new StringBuilder();
        sumString.append(s3);
        sumString.reverse();
        int i = 0;
        ListNode temp = new ListNode(0);
        ListNode node = temp;
        while (i<sumString.length()){
            char ch = sumString.charAt(i);
            node.next = new ListNode(Integer.parseInt(String.valueOf(ch)));
            i++;
            node  = node.next;
        }

        return temp.next;
    }
}
