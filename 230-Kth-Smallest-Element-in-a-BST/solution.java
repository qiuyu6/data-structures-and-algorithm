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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        TreeNode cur = root;
        TreeNode res = null;
        while(k > 0){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            res = stack.pop();
            k--;
            cur = res.right;
        }
        return res.val;
    }
}