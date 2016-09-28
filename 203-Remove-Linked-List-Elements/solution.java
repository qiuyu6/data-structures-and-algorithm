/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        while(head != null && head.val == val){
                head = head.next;
        }
        if(head == null) return null;
        
        if(head.next == null) return head;
        ListNode res = head;
        while(res.next.next != null){
            if(res.next.val == val){
                res.next = res.next.next; 
            }else{
                res = res.next;
            }
            
            if(res.next == null) return head;
        }
        if(res.next.val == val) res.next = null;
        return head;
    }
}