/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
        if(head.next.next == null){
            ListNode res = head.next;
            res.next = head;
            head.next = null;
            return res;
        }
        ListNode orig = head.next;
        ListNode pointer = head.next;
        ListNode prev = pointer;
        while(pointer.next != null){
            ListNode temp = pointer.next;
            pointer.next = head;
            head.next = temp;
            prev = head;
            if(head.next.next == null){
                pointer = head.next;
                pointer.next = null;
                return orig;
            }else{
                
                head = temp;
                pointer = temp.next;
                prev.next = pointer;
            }
            
            
        }
        
        ListNode ln = head;
        head = pointer;
        pointer.next = ln;
        pointer.next.next = null;
        
        return orig;
    }
}