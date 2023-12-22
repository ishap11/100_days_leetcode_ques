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
    public void reorderList(ListNode head) {

        if(head == null || head.next == null){
            return ;
        }

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow =slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow;

        ListNode newNode = reverseList(slow.next);
        slow.next = null;

        ListNode curr = head;
        
        ListNode temp1 = newNode;

        while(head != null && temp1 != null){
            ListNode temp = curr.next;
            curr.next = temp1;
            ListNode temp2 = temp1.next;
            temp1.next = temp;
            curr = temp;
            temp1 = temp2;
        }

    }

    public ListNode reverseList(ListNode node){
        ListNode prev =  null;
        ListNode curr = node;

        while(curr != null){
            ListNode next  = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
        return prev;
    }
}