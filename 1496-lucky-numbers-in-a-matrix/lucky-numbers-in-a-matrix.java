class Solution {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int minInRow = Integer.MAX_VALUE;
            int minColIndex = -1;

            // Find the minimum element in the row
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minInRow) {
                    minInRow = matrix[i][j];
                    minColIndex = j;
                }
            }

            // Check if the minimum element in the row is the maximum in its column
            boolean isMaxInCol = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minColIndex] > minInRow) {
                    isMaxInCol = false;
                    break;
                }
            }

            if (isMaxInCol) {
                luckyNumbers.add(minInRow);
            }
        }

        return luckyNumbers;
    }
}