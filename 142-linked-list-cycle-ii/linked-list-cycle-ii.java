/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                // we found the cycle now we need to find the starting point of their meeting
                ListNode startIndex = head;
                while(startIndex!=slow){
                    startIndex = startIndex.next;
                    slow = slow.next;
                }
                return startIndex;
        

            }
        }
        return null;
    }
}