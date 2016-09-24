public class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int [] nums = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'I') nums[i] = 1;
            else if(s.charAt(i) == 'V') nums[i] = 5;
            else if(s.charAt(i) == 'X') nums[i] = 10;
            else if(s.charAt(i) == 'L') nums[i] = 50;
            else if(s.charAt(i) == 'C') nums[i] = 100;
            else if(s.charAt(i) == 'D') nums[i] = 500;
            else if(s.charAt(i) == 'M') nums[i] = 1000;
        }
        for(int i = 0; i < s.length() - 1; i++){
            if(nums[i] < nums[i+1]) res = res - nums[i];
            else res = res + nums[i];
        }
        res = res + nums[nums.length - 1];
        return res;
    }
}