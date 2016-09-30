public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int one = (C - A) * (D - B);
        int two = (G - E) * (H - F);
        
        int bigLeft = Math.max(A, E);
        int smallRight = Math.min(C, G);
        int smallTop = Math.min(D, H);
        int bigBottom = Math.max(F, B);
        int overlap = 0;
        if(smallRight > bigLeft && bigBottom < smallTop)
            overlap = (smallRight - bigLeft) * (smallTop - bigBottom);
        
        int res = one + two - overlap;
        return res;
    }
}