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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null) return null;
        if(nums.length == 0) return null;
        TreeNode res = sortedArrayToBST(nums, 0, nums.length-1);
        return res;
    }
        
    public TreeNode sortedArrayToBST(int [] nums, int low, int high){
        if(low > high) return null;
        
        int mid = (low + high)/2;
        TreeNode head = new TreeNode(nums[mid]);
        head.left = sortedArrayToBST(nums, low, mid-1);
        head.right = sortedArrayToBST(nums, mid + 1, high);
        return head;
    }
    
}