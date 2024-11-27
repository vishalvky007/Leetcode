class Solution {
public:

    int reverse(int num){
        long rev = 0;
        while(num > 0) {
            rev *= 10;
            rev += num % 10;
            num /= 10;
        }
        return rev;
    }

    bool isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        else if(x == 0) {
            return true;
        }
        else {
            if(x == reverse(x)) {
                return true;
            }
        }
        return false;
    }
};