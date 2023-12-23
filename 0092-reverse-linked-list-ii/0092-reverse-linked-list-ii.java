class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        // Move prev and curr to positions before the sublist to be reversed
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
            curr = curr.next;
        }

        ListNode sublist = curr;

        ListNode preNode = null;
        for (int i = 0; i < right - left + 1; i++) {
            ListNode next = curr.next;
            curr.next = preNode;
            preNode = curr;
            curr = next;
        }

        // Reconnect the reversed sublist back to the original list
        prev.next = preNode;
        sublist.next = curr;

        return dummy.next;
    }
}
