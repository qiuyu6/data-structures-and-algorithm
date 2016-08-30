public class Solution {
    public int firstUniqChar(String s) {
        int [] let = new int[26];
        int res = -1;
        for(int i = 0; i < s.length(); i++){
            let[s.charAt(i) - 97]++;
        }
        for(int j = 0; j < s.length(); j++){
            if(let[s.charAt(j) - 97] == 1){
                res = j;
                break;
            }
        }
        return res;
    }
}