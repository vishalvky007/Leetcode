class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xor_result = nums[0];

        for(int i=1; i<nums.length; i++) {
            xor_result = xor_result ^ nums[i];
        }

        return xor_result;
    }
}