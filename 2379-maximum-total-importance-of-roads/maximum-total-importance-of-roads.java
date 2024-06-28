class Solution {
      public static long maximumImportance(int n, int[][] roads) {
        // Step 1: Calculate the degree of each city
        int[] degree = new int[n];
        for (int[] road : roads) {
            degree[road[0]]++;
            degree[road[1]]++;
        }
        
        // Step 2: Create an array of city indices and sort it by degrees in descending order
        Integer[] cities = new Integer[n];
        for (int i = 0; i < n; i++) {
            cities[i] = i;
        }
        Arrays.sort(cities, (a, b) -> Integer.compare(degree[b], degree[a]));
        
        // Step 3: Assign values to cities based on their sorted order
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            value[cities[i]] = n - i;
        }
        
        // Step 4: Calculate the total importance of all roads
        long totalImportance = 0;
        for (int[] road : roads) {
            totalImportance += (long) value[road[0]] + value[road[1]];
        }
        
        return totalImportance;
    }
}