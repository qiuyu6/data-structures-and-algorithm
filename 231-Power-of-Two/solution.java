public class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean res = true;
        if (n <= 0) res = false;
        //else if(n == 1) res = true;
            else{
                while (n > 1){
                    if(n % 2 != 0){
                        res = false; 
                        break;
                    }
                    n = n/2;
            }
        }
        return res;
    }
}