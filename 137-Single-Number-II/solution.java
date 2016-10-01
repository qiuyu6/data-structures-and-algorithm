public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        int[] digit = new int[32];
        for(int i = 0; i < nums.length; i++){
            int k = 31;
            int temp = nums[i];
            
            while(temp != 0){
                if(temp%2 != 0) digit[k]++;
                temp = temp >>> 1;
                k--;
            }
        }
        int n = 1;
        for(int i = digit.length-1; i >= 0; i--){
            if(digit[i]%3 != 0) res = res + n;
            n = 2*n;
        }
        return res;
    }
}