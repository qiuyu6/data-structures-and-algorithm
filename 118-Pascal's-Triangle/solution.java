public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        
        if(numRows == 0) return res;
        
        res.add(new LinkedList<Integer>());
        res.get(0).add(1);
        int level = 1;
        while(level < numRows){
            res.add(new LinkedList<Integer>());
            res.get(level).add(1);
            for(int i = 1; i < level; i++){
                int sum = res.get(level-1).get(i-1) + res.get(level-1).get(i);
                res.get(level).add(sum);
            }
            res.get(level).add(1);
            level++;
        }
        return res;
    }
}