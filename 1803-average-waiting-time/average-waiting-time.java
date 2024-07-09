class Solution {
    public double averageWaitingTime(int[][] customers) {
        int currentTime = 0;
        double totalWaitTime = 0.0;
        
        for (int[] customer : customers) {
            int arrivalTime = customer[0];
            int prepTime = customer[1];
            
            if (currentTime < arrivalTime) {
                currentTime = arrivalTime;
            }
            
            int finishTime = currentTime + prepTime;
            totalWaitTime += (finishTime - arrivalTime);
            currentTime = finishTime;
        }
        
        return totalWaitTime / customers.length;
    }
}