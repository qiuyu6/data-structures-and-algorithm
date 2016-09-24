public class Solution {
    public int reverse(int x) {
        int sign = 1;
        if(x < 0) sign = -1;
        x = Math.abs(x);
        long res = 0;
        while(x != 0){
            int rem = x % 10;
            res = res * 10 + rem;
            x = x / 10;
        }
        if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) return 0;
        res = res*sign;
        return (int) res;
    }
}