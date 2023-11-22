class Solution {
    public ListNode removeNodes(ListNode head) {
        head = reverseList(head);
        ListNode current = head;
        int maxVal = head.val;
        ListNode previous = head;
        head = head.next;
        while (head != null) {
            if (head.val < maxVal) {
                previous.next = head.next;
                head = previous.next;
            } else {
                maxVal = head.val;
                previous = head;
                head = head.next;
            }
        }
        head = reverseList(current);
        return head;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        if (head == null || head.next == null) {
            return head;
        }
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
