class Solution {
    public int countMaxOrSubsets(int[] nums) {
        // target or
        int targetOr = 0;
        for(int num: nums) {
            targetOr |= num;
        }
        return recur(0,nums,0,targetOr);
    }

    public int recur(int index, int nums[], int curOr, int targetOr) {
        // base case
        if(index == nums.length) {
            return (curOr == targetOr) ? 1:0;
        }
        // pick
        int pickCount = recur(index+1, nums, curOr | nums[index], targetOr);
        // no pick
        int noPickCount = recur(index+1, nums, curOr, targetOr);
        return pickCount+noPickCount;
    }
}