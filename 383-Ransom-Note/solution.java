public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        boolean res = true;
        int [] let = new int [26];
        for(int i = 0; i < magazine.length(); i++){
            let[magazine.charAt(i)-97]++;
        }
        for(int j = 0; j < ransomNote.length(); j++){
            let[ransomNote.charAt(j)-97]--;
            int temp = let[ransomNote.charAt(j)-97];
            if (temp < 0) return false;
        }
        return res;
    }
}