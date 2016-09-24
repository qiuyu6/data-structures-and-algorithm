public class Solution {
    public boolean isPalindrome(int x) {
        if(x >= 0 && x <= 9) return true;
        if(x < 0 || x%10 == 0) return false;
        int sec = 0;
        
        while(x > sec){
            int temp = x % 10;
            sec = sec * 10 + temp;
            x = x / 10;
        }
        if(x == sec || sec/10 == x) return true;
        return false;
    }
}