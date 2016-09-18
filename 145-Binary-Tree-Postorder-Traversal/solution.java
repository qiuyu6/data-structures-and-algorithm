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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<Integer>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        TreeNode cur = root;
        while(cur != null || !stack.empty()){
            if(cur != null){
                stack.push(cur);
                res.addFirst(cur.val);
                cur = cur.right;
            }else{
                cur = stack.pop();
                cur = cur.left;
            }
            
        }
        return res;
    }
}