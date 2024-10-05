class Solution {
    public boolean rotateString(String s, String goal) {
        
        // Check if lengths are the same, otherwise no rotation is possible
        if(s.length() != goal.length()) {
            return false;
        }

        // Concatenate string 's' with itself
        String doubled = s + s;

        // Check if goal is a substring of doubled
        return doubled.contains(goal);
    }
}