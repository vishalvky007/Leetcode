class Solution {
    public String sortSentence(String s) {
        
        // Map to store words in correct order
        Map<Integer, String> indexWordMap = new HashMap<>();

        // Split each word based on space
        for(String word : s.split(" ")) {
            int lastIndex = word.length() - 1;

            // get the word and index separately
            int index = word.charAt(lastIndex) - '0';
            String actualWord = word.substring(0, lastIndex);

            indexWordMap.put(index, actualWord); 
        }

        // Build the actual string
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer,String> indexWord : indexWordMap.entrySet()) {
            sb.append(indexWord.getValue());
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}