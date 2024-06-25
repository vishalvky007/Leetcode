class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        String current = "";
        String longest = "";

        int j=0;
        for(int i=0;i<s.length();) {
            char ch = s.charAt(i);
            if(set.contains(ch)) {
                current = "";
                set.clear();
                i=++j;
            }
            else {
                set.add(ch);
                current += ch;
                i++;
            }
            if(current.length() > longest.length()) {
                longest = current;
            }
        } 
        return longest.length();
    }
}