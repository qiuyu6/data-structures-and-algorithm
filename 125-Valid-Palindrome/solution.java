public class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return true;
        s = s.toLowerCase();
        int right = s.length() - 1;
        int left = 0;
        boolean one = false;
        boolean two = false;
        while(left < right){
            while(!one && left < s.length()){
                if((s.charAt(left) >= 'a' && s.charAt(left) <= 'z') || (s.charAt(left) - '0'<= 9 && s.charAt(left) - '0'>= 0 )){
                    one = true;
                }else{
                    left++;
                }
            }
            while(!two && right >= 0){
                if((s.charAt(right) >= 'a' && s.charAt(right) <= 'z') || (s.charAt(right) - '0'<= 9 && s.charAt(right) - '0'>= 0 )){
                    two = true;
                }else{
                    right--;
                }
            }
            if(left >= s.length() && right < 0) return true;
            if(s.charAt(left) != s.charAt(right)) return false;
            else{
                left++;
                right--;
            }
            one = false;
            two = false;
        }
        return true;
    }
}