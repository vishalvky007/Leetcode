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
// Basic Solution
// class Solution {
//     public ListNode removeNodes(ListNode head) {
//         Stack<ListNode> stack = new Stack<>();
//         ListNode temp = head;
//         while(temp != null) {
//             stack.push(temp);
//             temp = temp.next;
//         }

//         ListNode newHead = stack.pop();
//         int maxVal = newHead.val;
//         while(!stack.empty()) {
//             ListNode node = stack.pop();
//             if(node.val < maxVal) {
//                 continue;
//             } else {
//                 // insert at head
//                 node.next = newHead;
//                 newHead = node;
//                 maxVal = node.val;
//             } 
//         }
//         return newHead;
//     }
// }

// Optimised Solution
class Solution {
    public ListNode removeNodes(ListNode head) {
        // reverse the linked list
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextNode = null;

        while(curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // create new list
        ListNode newList = new ListNode(prev.val);
        curr = prev.next;
        int maxVal = newList.val;
        while(curr != null) {
            if(curr.val>=maxVal) {
                ListNode node = new ListNode(curr.val);
                node.next = newList;
                newList = node;
                maxVal = node.val;
            }
            curr = curr.next;
        }

        return newList;
    }
}