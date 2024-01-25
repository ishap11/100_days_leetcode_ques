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
//     static ListNode th = null;
//     static ListNode tt = null;

//     public ListNode addFirst(ListNode head){
//         if(th == null){
//             th = head;
//             tt = head;
//         }else{
//             head.next = th;
//             th = head;
//         }
    // }
   public ListNode reverseList(ListNode head) {
//         ListNode curr = head;
//         while(curr != null){
//             ListNode forw = curr.next;
//             curr.next = null;
//             addFirst(curr);
//             curr = forw;
//         }
        
        // FIRST APPROACH
        ListNode prev = null;
        ListNode curr = head;

        if(head == null  || head.next == null){
            return head;
        }
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev ;
        // return th;
    }
}