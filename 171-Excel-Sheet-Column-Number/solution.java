public class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        for(int i = s.length(); i > 0; i--){
            char c = s.charAt(s.length()-i);
            int k = c - 64;
            res = res + (int) (Math.pow(26, i-1) *k);
        }
        return res;
    }
}