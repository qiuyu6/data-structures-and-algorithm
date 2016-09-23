public class Solution {
    public String addBinary(String a, String b) {
        String res = "";
        if(a.length() < b.length()){
            String temp = b;
            b = a;
            a = temp;
        }
        int carry = 0;
        int p = a.length()-1;
        for(int i = b.length()-1; i >= 0; i--){
            int one = a.charAt(p) - '0';
            int two = b.charAt(i) - '0';
            int ans = one + two + carry;
            if(ans == 0 || ans == 1){
                res = ans + res;
                carry = 0;
            }else if(ans == 2){
                carry = 1;
                res = 0 + res;
            }else{
                carry = 1;
                res = 1 + res;
            }
            p--;
        }
        
        for(int j = a.length()-b.length()-1; j >= 0; j--){
            if(carry == 1){
                int one = a.charAt(j) - '0';
                int ans = one + carry;
                if(ans == 0 || ans == 1){
                    res = ans + res;
                    carry = 0;
                }else{
                    carry = 1;
                    res = 0 + res;
                }
            }else{
                res = a.charAt(j) + res;
            }
        }
        if(carry == 1) res = carry + res;
        return res;
    }
}