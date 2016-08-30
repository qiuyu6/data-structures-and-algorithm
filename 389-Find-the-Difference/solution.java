public class Solution {
    public char findTheDifference(String s, String t) {
        int [] let = new int[26];
        char res = t.charAt(0);
        for(int i = 0; i < s.length(); i++){
            let[s.charAt(i) - 97] ++;
        }
        for(int j = 0; j < t.length(); j++){
            let[t.charAt(j) - 97] --;
            if(let[t.charAt(j) - 97] < 0) {
                res = t.charAt(j);
                break;
            }
        }
        return res;
    }
}