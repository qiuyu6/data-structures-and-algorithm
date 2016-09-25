/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, sum, res, path);  
        return res;
    }
    
    public void dfs(TreeNode root, int sum, List<List<Integer>> res, List<Integer> path){
        if(root == null) return;
        if(root.left == null && root.right == null) {
            if (sum == root.val) {
                List<Integer> tmp = new ArrayList<Integer>(path);
                tmp.add(root.val);
                res.add(new ArrayList<Integer>(tmp));
            } 
            return;
        }
        path.add(root.val);
        dfs(root.left, sum - root.val, res, path);
        dfs(root.right, sum - root.val, res, path);
        path.remove(path.size()-1);
    }
}