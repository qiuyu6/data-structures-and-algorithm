/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        return sortedListToBST(head, null);
    }
    
    public TreeNode sortedListToBST(ListNode head, ListNode tail){
        if(head == tail) return null;
        ListNode slow  = head;
        ListNode fast = head;
        while(fast != tail && fast.next != tail){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        TreeNode res = new TreeNode(slow.val);
        res.left = sortedListToBST(head, slow);
        res.right = sortedListToBST(slow.next, tail);
        return res;
    }
}