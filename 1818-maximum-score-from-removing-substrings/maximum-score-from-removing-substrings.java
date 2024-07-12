class Solution {
      public int maximumGain(String s, int x, int y) {
        // Determine the priority based on the values of x and y
        if (x >= y) {
            return calculatePoints(s, 'a', 'b', x, y);
        } else {
            return calculatePoints(s, 'b', 'a', y, x);
        }
    }

    private int calculatePoints(String s, char first, char second, int firstPoints, int secondPoints) {
        int totalPoints = 0;
        StringBuilder sb = new StringBuilder();

        // First pass: prioritize removing "firstsecond"
        for (char c : s.toCharArray()) {
            if (c == second && sb.length() > 0 && sb.charAt(sb.length() - 1) == first) {
                sb.deleteCharAt(sb.length() - 1);
                totalPoints += firstPoints;
            } else {
                sb.append(c);
            }
        }

        // Second pass: prioritize removing "secondfirst" in the remaining string
        StringBuilder finalSb = new StringBuilder();
        for (char c : sb.toString().toCharArray()) {
            if (c == first && finalSb.length() > 0 && finalSb.charAt(finalSb.length() - 1) == second) {
                finalSb.deleteCharAt(finalSb.length() - 1);
                totalPoints += secondPoints;
            } else {
                finalSb.append(c);
            }
        }

        return totalPoints;
    }

}