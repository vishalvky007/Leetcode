class Solution {
    public int maximumSwap(int num) {
        
        // convert number to string to iterate easily
        String numStr = Integer.toString(num);
        int n = numStr.length();

        int maxNum = num;

        // Iterate over string
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                char charArray[] = numStr.toCharArray();

                // Swap ith and jth digits
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;

                // store swapped number
                int swappedNum = Integer.parseInt(new String(charArray));

                // update maxNum
                maxNum =  Math.max(swappedNum, maxNum);
            }
        }
        
        return maxNum;
    }
}