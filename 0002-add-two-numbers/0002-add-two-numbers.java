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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //SC- O(n) TC - O(n)
        // if(l1 == null || l2 == null) {
        //     return (l1 != null ? l1 :l2);
        // }
        // ListNode head = new ListNode(-1);
        // ListNode itr = head;
        // int carry = 0;
        // while(l1 != null || l2 != null || carry == 1){
        //     int sum = carry + (l1 != null ?l1.val : 0 ) + (l2 != null ?l2.val : 0 );
        //     int digit = sum % 10;
        //     carry = sum /10;
        //     itr.next = new ListNode(digit);

        //     itr = itr.next;
        //     if(l1!= null) l1 = l1.next;
        //     if(l2 != null) l2 = l2.next;
        // }
        // return head.next; 


        // other approach
        ListNode head = null;
        int data = 0;
        int carry =0;
        ListNode prev = null;
        ListNode curr = null;

        while(l1 != null || l2 != null || carry != 0 ){
            data= carry;

            if(l1 != null){
                data += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                data += l2.val;
                l2 = l2.next;
            }
            carry = data/10;
            data = data %10;

            curr = new ListNode(data);
            if(prev == null){
                head = curr;
            }else{
                prev.next = curr;
            }
            prev  = curr;
        }
        return head;
    }
}