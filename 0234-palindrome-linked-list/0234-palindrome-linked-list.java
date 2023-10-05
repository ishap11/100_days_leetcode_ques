/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode midNode(ListNode head){
        if(head == null && head.next == null){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static ListNode reverseofLL(ListNode head){
        if(head == null ){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode forw = null;

        while(curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null && head.next == null){
            return true;
        }
        ListNode mid = midNode(head);
        ListNode nHead = mid.next;
        mid.next = null;

        nHead = reverseofLL(nHead);
        ListNode c1 = head;
        ListNode c2 = nHead;
        boolean res = true;
        while(c2 !=  null){
            if(c1.val != c2.val){
                res = false;
                break;
            }
            c1 = c1.next;
            c2 = c2.next;
        }
        nHead = reverseofLL(nHead);
        mid.next = nHead;

        return res;
    }
}