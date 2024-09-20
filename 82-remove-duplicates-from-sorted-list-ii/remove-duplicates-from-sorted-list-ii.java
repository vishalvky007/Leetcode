/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        // Loop through the list until end
        while (curr != null) {
            // check for duplicates
            if (curr.next != null && curr.val == curr.next.val) {
                int val = curr.val;
                // skip through duplicates
                while (curr != null && curr.val == val) {
                    curr = curr.next;
                }
                // condition to delete duplicates
                if (prev != null) {
                    prev.next = curr;
                } else {
                    // condition when duplicates starts from head of original list
                    head = curr;
                }

            }
            // if no repeated found, move to next node
            // prev to keep track of node prev to curr node
            else {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}