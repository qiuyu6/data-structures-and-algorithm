public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        if(needle.length() > haystack.length()) return -1;
        int j = 0;
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(j)){
                int temp = i+1;
                j++;
                boolean check = true;
                while(j < needle.length() && temp < haystack.length()){
                    if(haystack.charAt(temp) != needle.charAt(j)){
                        j = 0;
                        check = false;
                        break;
                    }
                    temp++;
                    j++;
                }
                if(check && j == needle.length()) return i;
            }
        }
        return -1;
    }
}