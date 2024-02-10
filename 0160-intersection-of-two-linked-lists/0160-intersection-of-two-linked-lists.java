/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        ListNode tempA = headA;
        while(tempA != null){
            tempA = tempA.next;
            lenA++;
        }
        int lenB = 0;
        ListNode tempB = headB;
        while(tempB != null){
            tempB = tempB.next;
            lenB++;
        }
       
        int delta = Math.abs(lenA - lenB);
        tempA = headA;
        tempB = headB;
        if(lenA  > lenB ){
            for(int i = 0; i<delta ; i++){
                tempA = tempA.next;
            }
        }
        if(lenA  < lenB){
            for(int i = 0; i<delta ; i++){
                tempB = tempB.next;
            }
        }
        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}