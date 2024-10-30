class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        } else {

            char s1[] = s.toCharArray();
            char s2[] = t.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);

            int i = 0;
            while (i < s.length()) {
                if (s1[i] != s2[i]) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}