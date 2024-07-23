class Solution {
   public int[] frequencySort(int[] nums) {
        // \U0001f4ca Create a hashmap to store the frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // \U0001f504 Convert the array to an Integer array to use Arrays.sort with a custom comparator
        Integer[] arrobj = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arrobj[i] = nums[i];
        }

        // \U0001f4da Sort the array based on the custom comparator
        Arrays.sort(arrobj, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return Integer.compare(b, a); // Sort by value in descending order if frequencies are the same
            }
            return Integer.compare(map.get(a), map.get(b)); // Sort by frequency in ascending order
        });

        // \U0001f504 Convert the sorted array back to int array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arrobj[i];
        }

        return nums;
    }
}