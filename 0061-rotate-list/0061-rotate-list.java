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
    public ListNode rotateRight(ListNode head, int k) {
         //TC - o(N) SC - O(1)
        //  Brute force approach
    //    if(head == null || head.next == null) return head;

    //    for(int i= 0 ; i< k ; i++){
    //        ListNode temp = head;
    //        while(temp.next.next != null) temp = temp.next;
    //        ListNode last = temp.next;
    //        temp.next = null;
    //        last.next = head;
    //        head = last;
    //    }
    //    return head;

    // optimised one  //tic =- O(N) sc - O(1)
    if(head == null||head.next == null||k == 0) return head;
    //calculating length
    ListNode temp = head;
    int length = 1;
    while(temp.next != null) {
        ++length;
        temp = temp.next;
    }
    //link last node to first node
    temp.next = head;
    k = k%length; //when k is more than length of list
    int end = length-k; //to get end of the list
    while(end--!=0) temp = temp.next;
    //breaking last node link and pointing to NULL
    head = temp.next;
    temp.next = null;
        
    return head;
        
    }
}