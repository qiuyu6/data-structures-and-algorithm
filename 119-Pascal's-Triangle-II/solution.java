public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new LinkedList<Integer>();
        for(int i = 0; i < rowIndex + 1; i++){
            res.add(0,1);
            for(int j = 1; j < res.size()-1; j++){
                res.set(j, res.get(j) + res.get(j+1));
            }
        }
        return res;
    }
}