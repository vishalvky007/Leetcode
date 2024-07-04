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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0); // Dummy node to help build the new list
        ListNode current = dummy;
        ListNode temp = head.next; // Start from the node after the first 0

        while (temp != null) {
            int sum = 0;
            while (temp != null && temp.val != 0) {
                sum += temp.val;
                temp = temp.next;
            }
            current.next = new ListNode(sum); // Create a new node with the sum
            current = current.next;
            if (temp != null)
                temp = temp.next; // Skip the zero node
        }

        return dummy.next; // Return the head of the modified list
    }
}