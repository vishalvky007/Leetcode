class Solution {
    public int findTheWinner(int n, int k) {
    boolean[] friends = new boolean[n];
    Arrays.fill(friends, true); // Initially all friends are present
    
    int current = 0; // Start from the first friend
    
    while (remaining(friends) > 1) {
        int count = 0;
        while (count < k) {
            if (friends[current]) {
                count++;
            }
            if (count < k) {
                current = (current + 1) % n; // Move to the next friend in circular manner
            }
        }
        // Remove the current friend
        friends[current] = false;
        // Move to the next friend after the removed one
        while (!friends[current]) {
            current = (current + 1) % n;
        }
    }
    
    // Find the index of the last remaining friend
    for (int i = 0; i < n; i++) {
        if (friends[i]) {
            return i + 1; // Return 1-based index
        }
    }
    
    return -1; // Should never reach here according to problem statement
}

// Utility function to count remaining friends
private int remaining(boolean[] friends) {
    int count = 0;
    for (boolean friend : friends) {
        if (friend) {
            count++;
        }
    }
    return count;
}
}