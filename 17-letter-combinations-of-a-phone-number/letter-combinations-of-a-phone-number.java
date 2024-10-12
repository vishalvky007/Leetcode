class Solution {
    List<String> result = null;
    String[] mapping = new String[]{
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };
    public List<String> letterCombinations(String digits) {
            result = new ArrayList<>();
            if(digits.length() == 0) return result;
            dfs(0,digits,new StringBuilder());
            return result;
    }

    private void dfs(int length, String digits, StringBuilder sb) {
        if(length == digits.length()) {
            result.add(sb.toString());
            return;
        }

        // loop digit present at length index of digits string
        char ch = digits.charAt(length);
        String str = mapping[ch-'0'];
        for(char c : str.toCharArray()) {
            sb.append(c);
            dfs(length+1, digits, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}