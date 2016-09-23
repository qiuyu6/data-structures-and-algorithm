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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            if(temp.left == null && temp.right == null && temp.val == sum) return true;
            if(temp.left != null){
                temp.left.val = temp.left.val + temp.val;
                stack.push(temp.left);
            }
            if(temp.right != null){
                temp.right.val = temp.right.val + temp.val;
                stack.push(temp.right);
            }
        }
        return false;
    }
}