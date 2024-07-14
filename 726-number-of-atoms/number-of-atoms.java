class Solution {
    public String countOfAtoms(String formula) {
        int n = formula.length();
        Stack<Map<String, Integer>> stack = new Stack<>();
        Map<String, Integer> currentMap = new HashMap<>();
        int i = 0;
        
        while (i < n) {
            char c = formula.charAt(i);
            
            if (c == '(') {
                // Push current map to stack and start a new one
                stack.push(currentMap);
                currentMap = new HashMap<>();
                i++;
            } else if (c == ')') {
                // Parse the number following ')'
                int iStart = ++i;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                int multiplier = iStart < i ? Integer.parseInt(formula.substring(iStart, i)) : 1;
                
                // Pop the top map and combine it with the current map
                if (!stack.isEmpty()) {
                    Map<String, Integer> topMap = currentMap;
                    currentMap = stack.pop();
                    for (String atom : topMap.keySet()) {
                        currentMap.put(atom, currentMap.getOrDefault(atom, 0) + topMap.get(atom) * multiplier);
                    }
                }
            } else {
                // Parse the atom name
                int iStart = i++;
                while (i < n && Character.isLowerCase(formula.charAt(i))) i++;
                String atom = formula.substring(iStart, i);
                
                // Parse the number following the atom name
                iStart = i;
                while (i < n && Character.isDigit(formula.charAt(i))) i++;
                int count = iStart < i ? Integer.parseInt(formula.substring(iStart, i)) : 1;
                
                // Add the atom to the current map
                currentMap.put(atom, currentMap.getOrDefault(atom, 0) + count);
            }
        }
        
        // Format the result
        TreeMap<String, Integer> sortedMap = new TreeMap<>(currentMap);
        StringBuilder result = new StringBuilder();
        for (String atom : sortedMap.keySet()) {
            result.append(atom);
            int count = sortedMap.get(atom);
            if (count > 1) result.append(count);
        }
        
        return result.toString();
    }
}