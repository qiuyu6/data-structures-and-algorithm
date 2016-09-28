public class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0) return 0;
        while(s.charAt(s.length()-1) == ' '){
            s = s.substring(0, s.length()-1);
            if(s.length() == 0) return 0;
        }
        char[] c = s.toCharArray();
        for(int i = s.length() - 1; i >= 0; i--){
            if(!(c[i] < 'a' || c[i] >'z') && !(c[i] < 'A' || c[i] > 'Z') )
            return 0;
            if(c[i] == ' ') return s.length() - i - 1;
        }
        return s.length();
    }
}