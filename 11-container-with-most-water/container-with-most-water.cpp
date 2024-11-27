class Solution {
public:
    int maxArea(vector<int>& height) {
        int lp = 0, rp = height.size()-1;
        int maxWater = 0, currWater = 0;
        int wd = 0, ht = 0;
        while(lp<rp) {
            wd = rp - lp;
            ht = min(height[lp],height[rp]);
            currWater = ht * wd;
            maxWater = max(maxWater,currWater);

            height[lp] < height[rp] ?  lp++ : rp--;
        }
        
        return maxWater;
    }
};