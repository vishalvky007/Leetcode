class Solution {
    public int repeatedStringMatch(String a, String b) {
        
        int repeats = b.length()/a.length();
        int count = 1;
        String strA = a;
        for(int i=0; i<repeats+2; i++) {
            if(a.contains(b)) 
                return count;
            else {
                a += strA;
                count++;
            }
        }
        return -1;
    }
}