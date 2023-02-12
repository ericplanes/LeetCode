package LinkedList;

public class RemoveNthNode {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode act = head;
        ListNode del = head;

        // Find previous node to the one we need to delete
        int i = 1, j = 1;
        while (act.next != null) {
            act = act.next;
            if (i - j == n) {
                del = del.next;
                j++;
            }
            i++;
        }

        // Is head
        if (i == n) {
            return del.next;
        }

        // Is not head
        del.next = del.next.next;

        return head;
    }
}
