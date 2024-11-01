class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        
        // Add the first character to start comparisons
        sb.append(s.charAt(0));
        
        int consecutiveCount = 1;  // To track consecutive characters
        
        for (int i = 1; i < s.length(); i++) {
            // If the current character is the same as the previous one, increment the count
            if (s.charAt(i) == s.charAt(i - 1)) {
                consecutiveCount++;
            } else {
                // Reset the count if the character changes
                consecutiveCount = 1;
            }
            
            // Append the character only if we have less than 3 consecutive characters
            if (consecutiveCount < 3) {
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
}
