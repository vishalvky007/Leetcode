public class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLength = 0;
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] == 1 ? 1 : -1;

            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLength;
    }
}