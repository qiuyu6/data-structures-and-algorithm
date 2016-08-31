/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        
        ListNode prev = head.next;
        ListNode ln = reverseList(prev);
        
        head.next = null;
        prev.next = head;
        
        return ln;
    }
}