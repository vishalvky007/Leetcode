class Solution {
public:
    void sortColors(vector<int>& nums) {
        int l=0, r=nums.size()-1;
        int curr = 0;
        while(curr<=r) {
            if(nums[curr] == 0) {
                nums[curr] = nums[l];
                nums[l] = 0;
                l++;            
                curr++;
            } else if(nums[curr] == 1) {
                curr++;
            } else {
                nums[curr] = nums[r];
                nums[r] = 2;
                r--;
            }
        }        
    }
};