public class Solution {
    public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        int [] sta = new int[n];
        sta[0] = 1;
        sta[1] = 2;
        for(int i = 2; i < n; i++){
            sta[i] = sta[i-1] + sta[i-2];
        }
        return sta[n-1];
    }
}