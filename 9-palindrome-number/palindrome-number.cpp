class Solution {
public:

    bool isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        
        long reverse = 0;
        int x_copy = x;

        while(x>0) {
            reverse = (reverse*10) + (x % 10);
            x /= 10;
        }
        
        return reverse == x_copy;
    }
};