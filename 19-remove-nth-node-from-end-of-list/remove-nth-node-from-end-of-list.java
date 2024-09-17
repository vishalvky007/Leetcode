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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Make a dummy node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        // Use two pointers 
        ListNode firstPtr = dummy;
        ListNode secondPtr = dummy;

        // Make gap between pointers
        for(int i=0; i<n; i++) {
            secondPtr = secondPtr.next;
        }

        // move both pointers until secondPtr reaches end
        while(secondPtr.next != null) {
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }

        // Delete node next to firstPtr
        firstPtr.next = firstPtr.next.next;

        return dummy.next;
    }
}