class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Check if lengths of both string are same
        if(s.length() != t.length()) 
            return false;


        // Create HashMap
        Map<Character, Character> map = new HashMap<>();

        for(int i=0; i<s.length(); i++) {

            Character original = s.charAt(i);
            Character replacement = t.charAt(i);

            if(!map.containsKey(original)) {
                if(!map.containsValue(replacement)) {
                    map.put(original, replacement);
                }
                else {
                    return false;
                }
            }

            else {
                Character ch = map.get(original);

                if(replacement != ch) {
                    return false;
                };
            }
        }
        return true;
    }
}