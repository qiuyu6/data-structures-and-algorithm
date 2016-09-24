public class Solution {
    public boolean isPalindrome(int x) {
        int origin = x;
        int compare = 0;
        while(x > 0){
            compare = compare * 10 + x % 10;
            x = x/10;
        }
        return (origin == compare);
    }
}