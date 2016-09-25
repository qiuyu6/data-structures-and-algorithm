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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if(root != null) DFS(root, "", res);
        return res;
    }
    
    public void DFS(TreeNode root, String newPath, List wholePath){
        
        if(root.left == null && root.right == null) wholePath.add(newPath + root.val);
        if(root.left != null)  DFS(root.left, newPath + root.val + "->", wholePath);
        if(root.right != null)  DFS(root.right, newPath + root.val + "->", wholePath);
    }
}