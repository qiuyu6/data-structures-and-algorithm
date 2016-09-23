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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if(root == null) return res;
        traversal(res, root, 0);
        return res;
    }
    
    public void traversal(List<List<Integer>> res, TreeNode root, int level){
        if(root == null) return;
        if(level >= res.size())
            res.add(new LinkedList<Integer>());
        res.get(level).add(root.val);
        traversal(res, root.left, level+1);
        traversal(res, root.right, level+1);
    }
}