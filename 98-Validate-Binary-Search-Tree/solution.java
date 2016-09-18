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
    public boolean isValidBST(TreeNode root) {
       if(root == null) return true;
       Stack<TreeNode> stack = new Stack<TreeNode>();
       
       TreeNode cur = root;
       TreeNode p = null;
       TreeNode pre = null;
       while(cur != null || !stack.empty()){
           while(cur != null){
               stack.push(cur);
               cur = cur.left;
           }
           p = stack.pop();
           if(pre != null && pre.val >= p.val){
               return false;
           }
           pre = p;
           cur = p.right;
       }
       return true;
    }
}