class Solution {

    private int modifiedBinarySearch(int arr[], int target, int left, int right) {

        // if element not found (base condition) 
        if(left > right) 
            return -1;

        // Avoid overflow, same as (left+right)/2
        int mid = left+((right-left)/2);
        
        // If element is found
        if(arr[mid] == target)
            return mid; 

        // If left half is sorted
        if(arr[mid] >= arr[left]) {
            
            // If key is in left half
            if(arr[left] <= target && target <= arr[mid]) 
                return modifiedBinarySearch(arr, target, left, mid-1);
            else 
                return modifiedBinarySearch(arr, target, mid+1, right);
        } 
        // If right half is sorted
        else {
            // If key is in right half
            if(arr[mid] <= target && target <= arr[right]) 
                return modifiedBinarySearch(arr, target, mid+1, right);
            else 
                return modifiedBinarySearch(arr, target, left, mid-1);
        }
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = modifiedBinarySearch(nums, target, left, right);
        return result;
    }
}