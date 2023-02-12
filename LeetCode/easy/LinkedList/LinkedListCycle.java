package LinkedList;

import java.util.HashSet;

public class LinkedListCycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle1(ListNode head) {
        var set = new HashSet<ListNode>();

        while (head != null) {
            if (!set.add(head))
                return true;
            head = head.next;
        }

        return false;
    }

    public boolean hasCycle2(ListNode head) {
        ListNode first, second;
        first = head;
        second = head;
        while (first != null && second.next != null && second.next.next != null) {
            first = first.next;
            second = second.next.next;
            if (first == second)
                return true;
        }
        return false;
    }
}
