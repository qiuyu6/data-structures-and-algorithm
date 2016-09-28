public class Solution {
    public int myAtoi(String str) {
        if(str == null || str.length() == 0) return 0;
        int res = 0;
        int index = 0;
        int sign = 1;
        while(index < str.length() && str.charAt(index) == ' '){
            index++;
        }
        if(str.charAt(index) == '-'){
                sign = -1;
                index++;
                
        }else if(str.charAt(index) == '+'){
            index++;
        }
        for(int i = index; i < str.length(); i++){
            int dig = str.charAt(i) - '0';
            if(dig > 9 || dig < 0) return res*sign;
            if(res > (Integer.MAX_VALUE/10) || ((res == Integer.MAX_VALUE/10) && dig > 7)){
                if(sign == 1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
            res = res*10 + dig;
        }
        res = res * sign;
        return res;
    }
}