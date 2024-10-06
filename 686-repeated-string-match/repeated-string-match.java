class Solution {
    public int repeatedStringMatch(String a, String b) {
        int repeats = b.length() / a.length();
        int count = 1;
        StringBuilder sb = new StringBuilder(a);
        for (int i = 0; i < repeats + 2; i++) {
            if (sb.toString().contains(b))
                return count;
            else {
                sb.append(a);
                count++;
            }
        }
        return -1;
    }
}
