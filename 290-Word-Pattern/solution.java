public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        if(strs.length != pattern.length()) return false;
        HashMap<Character,String> one = new HashMap<>();
        HashMap<String,Character> two = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++){
            
            if(one.containsKey(pattern.charAt(i))){
                if(!strs[i].equals(one.get(pattern.charAt(i)))) return false;
            }else{
                one.put(pattern.charAt(i), strs[i]);
            }
            if(two.containsKey(strs[i])){
                if(pattern.charAt(i) != two.get(strs[i])) return false;
            }else{
                two.put(strs[i], pattern.charAt(i));
            }
        }
        return true;
    }
}