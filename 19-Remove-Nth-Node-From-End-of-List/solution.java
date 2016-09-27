/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;
        ListNode remove = new ListNode(0);
        ListNode left = head;
        ListNode right = head;
        
        while(n > 0){
            right = right.next;
            n--;
        }
        if(right == null) return head.next;
        while(right.next != null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return head;
    }
}