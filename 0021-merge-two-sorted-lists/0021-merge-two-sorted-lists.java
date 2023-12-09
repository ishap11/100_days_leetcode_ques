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
    /*
    public static class ListNode {
        ListNode head;
        ListNode tail;
        int size; 
    
        void addLast(int val){
            ListNode temp = new ListNode();
            temp.val= val;
            temp.next= null;
            
            if(size == 0){
            head = tail = temp;
            }else{
            tail.next = temp ; 
            tail = temp;
            }
            size++;
    
        }
    
    */

        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        /* 
        //     ListNode res = new ListNode(0);

        //     while(list1 != null && list2 != null){
        //         if(list1.val < list2.val){
        //         res.addLast(list1.val);
        //         list1 = list1.next;
        //         }
        //         else{
        //         res.addLast(list2.val);
        //         list2 = list2.next;
        //         } 
        //     }
        //     while(list1 != null){
        //         res.addLast(list1.val);
        //         list1 =list1.next;
        //     }
        //     while(list2 != null){
        //         res.addLast(list2.val);
        //         list2 = list2.next;
        //     }
        //     return res;
        // }
        // recursive approach   TC- O(n+m) SC -O(n+m)
        // if(list1 == null){
        //     return list2;
        // }
        // if(list2 == null){
        //     return list1;
        // }
        // if(list1.val <list2.val){
        //     list1.next = mergeTwoLists(list1.next , list2);
        //     return list1;
        // }else{
        //     list2.next = mergeTwoLists(list2.next , list1);
        //     return list2;
        */


        // ANOTHER APPROACH
            if(list1 == null) return list2;
            if(list2 == null) return list1;

            ListNode head = null;
            ListNode tail = null;

            while(list1 != null && list2 != null){
                ListNode temp = null;

                if(list1.val < list2.val){
                    temp = list1;
                    list1 = list1.next;
                }else{
                    temp = list2;
                    list2 =  list2.next;
                }
                temp.next = null;
                if(head == null) {
                    head = tail = temp;
                }else{
                    tail.next = temp;
                    tail = temp;
                }
            }

            if(list1 == null){
                tail.next = list2;
            }
            if(list2 == null) {
                tail.next = list1;
            }
            return head;
        }
        
    /*}*/
}