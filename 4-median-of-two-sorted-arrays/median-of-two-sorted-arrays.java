class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int[] mergedArray = new int[m + n];
        int i = 0, j = 0, k = 0;
        
        // Merge the two arrays
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }
        
        // Copy remaining elements of nums1, if any
        while (i < m) {
            mergedArray[k++] = nums1[i++];
        }
        
        // Copy remaining elements of nums2, if any
        while (j < n) {
            mergedArray[k++] = nums2[j++];
        }
        
        // Calculate the median
        int len = mergedArray.length;
        if (len % 2 == 0) {
            return (mergedArray[len / 2 - 1] + mergedArray[len / 2]) / 2.0;
        } else {
            return mergedArray[len / 2];
        }
    }
}