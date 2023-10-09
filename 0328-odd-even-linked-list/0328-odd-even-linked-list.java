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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummyOdd = new ListNode(-1);
        ListNode dummyEven = new ListNode(-1);

        ListNode even = dummyEven;
        ListNode odd = dummyOdd;
        ListNode curr = head;

        int n = 0; //variable that maintain whether the curr node is -ve or +ve
        while(curr != null){
            n++;
            if(n % 2 == 0){
                //even
                even.next = curr;
                even = even.next;
            }else{
                odd.next = curr;
                odd = odd.next;
            }
            curr = curr.next;
        }
        //important-> even.next = null; prevent cycle in a ll
        even.next = null;
        odd.next = dummyEven.next;

        return dummyOdd.next;
    }
}