public class Solution {
    public int[] countBits(int num) {
        int [] res = new int[num+1];
        int base = 0;
        for(int i = 0; i <= num; i++){
            if(i == 0) res[i] = 0;
            else if((i & i-1) == 0){
                res[i] = 1;
                base = i;
            }else{
                res[i] = res[i-base] + 1;
            }
        }
        return res;
    }
}