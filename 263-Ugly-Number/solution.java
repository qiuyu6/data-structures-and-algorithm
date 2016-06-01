public class Solution {
    public boolean isUgly(int num) {
        boolean res = true;
        if(num == 1) res = true;
        else if(num == 0) res = false;
        else{
            if((num % 2 != 0) && (num % 3 != 0) && (num % 5 != 0) ){
                res = false;
            }else{
                int remain = 0;
                if(num % 2 == 0) remain = num/2;
                else if(num % 3 == 0) remain = num/3;
                else remain = num/5;
                res = isUgly(remain);
            }
        }
        
        return res;
    }
}