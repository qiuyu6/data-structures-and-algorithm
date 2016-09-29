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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        int res = 0;
        Stack<TreeNode> stack = new Stack<>();
        Set<TreeNode> set = new HashSet<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            if(temp.left != null){
                stack.push(temp.left);
                set.add(temp.left);
            }
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left == null && temp.right == null){
                if(set.contains(temp)) res = res + temp.val;
            }
        }
        return res;
    }
}