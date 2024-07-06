class Solution {
     public int passThePillow(int n, int time) {
        // Each complete cycle (forward and backward) takes (2 * n - 2) seconds
        int cycleTime = 2 * n - 2;
        // Determine the effective time within one cycle
        int effectiveTime = time % cycleTime;

        // Determine the position based on effective time
        if (effectiveTime < n) {
            // If effective time is within the forward pass range
            return effectiveTime + 1;
        } else {
            // If effective time is within the backward pass range
            return 2 * n - effectiveTime - 1;
        }
    }
}