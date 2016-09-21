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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (root == null) return res;
        
        if(root.left == null && root.right == null){
            res.add(new LinkedList());
            res.get(0).add(root.val);
            return res;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        ArrayList<Integer> level = new ArrayList<Integer>();
        list.add(root);
        stack.push(root);
        level.add(0,1);
        level.add(1,0);
        int k = 1;
        int temp = level.get(k-1);
        while(!list.isEmpty()){
            root = list.get(0);
            
            if(root.right != null){
                stack.push(root.right);
                list.add(root.right);
                int val = level.get(k);
                val++;
                level.set(k, val);
                
            }
            if(root.left != null){
                stack.push(root.left);
                list.add(root.left);
                int val = level.get(k);
                val++;
                level.set(k, val);
            }
            
            temp--;
            if(temp == 0){
                k++;
                level.add(k,0);
                temp = level.get(k-1);
            }
            list.remove(0);
        }
        level.remove(k);
        
        int pointer = level.size()-1;
        for(int i = 0; i < level.size(); i++){
            
            res.add(new LinkedList());
            for(int j = 0; j < level.get(pointer); j++){
                int ans = stack.pop().val;
                res.get(i).add(ans);
            }
            pointer--;
        }
        res.remove(0);
        return res;
    }
}