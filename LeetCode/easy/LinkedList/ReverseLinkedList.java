package LinkedList;

public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        // Validations
        if (head == null || head.next == null) {
            return head;
        }

        ListNode first = head;
        ListNode next = head.next;
        ListNode pivot;

        while (next != null && next.next != null) {
            pivot = next.next;
            next.next = first;
            first = next;
            next = pivot;
        }

        next.next = first;
        head.next = null;

        return next;
    }
}
