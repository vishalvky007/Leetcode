class Solution {
    public int findDuplicate(int[] nums) {
        
        int slow = 0;
        int fast = 0;
        // Move slow pointer once, fast pointer twice,
        // until they meet each other
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        // Move slow and fast pointer until once position at a time 
        // until they meet again
        slow = 0;
        while(slow!=fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}