class Solution {
    public int searchInsert(int[] nums, int target) {
       
        int start = 0, end = nums.length-1;
        int mid = -1;    

        while(start <= end) {
            
            mid = (start + end) / 2;

            if(nums[mid] == target) {
                return mid;
            }
            else if(target < nums[mid]) {
                end = mid-1;
            }
            else {
                start = mid + 1;
            }    
        }
        return end+1;
    }
}