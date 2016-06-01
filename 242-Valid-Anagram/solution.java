public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char [] first = s.toCharArray();
        char [] second = t.toCharArray();
        int [] firstCount = new int[26];
        int [] secondCount = new int[26];
        for(int i = 0; i < first.length; i++){
            int index = (int)first[i];
            firstCount[index-97] ++;
        }
        for(int i = 0; i < second.length; i++){
            int index = (int)second[i];
            secondCount[index-97] ++;
        }
        if(firstCount.length != secondCount.length) return false;
        for(int j = 0; j < firstCount.length; j++){
            if(firstCount[j] != secondCount[j]) return false;
        }
        return true;
    }
}