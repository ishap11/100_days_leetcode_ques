/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // trick : hm copy krdenge node ne next ki value ko node ki place pr or node ke next ki jo value h usko link nii krenge
        ListNode curr = node.next;
        node.val = curr.val ; 
        node.next = node.next.next;
    }
}