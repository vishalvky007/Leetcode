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

    public ListNode reverse(ListNode head) {
        ListNode after = null;
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        } 
        return prev;
    }

    public int pairSum(ListNode head) {
        ListNode temp = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        } 
        temp  = reverse(slow.next);
        slow.next = temp;

        ListNode p1 = head;
        ListNode p2 = slow.next;

        int max = Integer.MIN_VALUE;
        int sum = 0;
        while(p2!=null) {
            sum = p1.val + p2.val;
            if(max<sum) {
                max = sum;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return max;
    }
}