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
public class Solution {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int res = 0;
        boolean flag = false;
        while (head != null) {
            if (!numSet.contains(head.val) && flag) {
                res++;
                flag = false;
            } else if (numSet.contains(head.val)) {
                flag = true;
            }
            head = head.next;
        }

        if (flag) {
            res++;
        }

        return res;
    }
}