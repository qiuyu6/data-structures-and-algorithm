public class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        String res = "";
        int[] dig = new int[num1.length() + num2.length()];
        int p = 1;
        
        for(int i = num1.length() - 1; i >= 0; i--){
            for(int j = num2.length() - 1; j >= 0; j--){
                int temp = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                dig[i + j + p] = dig[i + j + p] + temp;
                
            }
            
        }
        int carry = 0;
        for(int k = dig.length - 1; k >= 0; k--){
            int temp = dig[k] + carry;
            carry = temp / 10;
            res = temp%10 + res;
        }
        
        while(res.charAt(0) == '0'){
            res = res.substring(1, res.length());
        }
        return res;
    }
}