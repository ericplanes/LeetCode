package LinkedList;

public class MergeTwoSortedLists {

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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;
        ListNode newList;

        // Extreme cases
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        // Choose head
        if (list1.val < list2.val) {
            head = new ListNode(list1.val, list1.next);
            newList = head;
            list1 = list1.next;
        } else {
            head = new ListNode(list2.val, list2.next);
            newList = head;
            list2 = list2.next;
        }

        // Merge
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                newList.next = new ListNode(list1.val, list1.next);
                list1 = list1.next;
                newList = newList.next;
            } else {
                newList.next = new ListNode(list2.val, list2.next);
                list2 = list2.next;
                newList = newList.next;
            }
        }

        // Fill with the others
        while (list1 != null) {
            newList.next = new ListNode(list1.val, list1.next);
            list1 = list1.next;
            newList = newList.next;
        }

        while (list2 != null) {
            newList.next = new ListNode(list2.val, list2.next);
            list2 = list2.next;
            newList = newList.next;
        }

        return head;
    }

}
