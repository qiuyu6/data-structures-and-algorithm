/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int rem = (l1.val + l2.val) % 10;
        ListNode head = new ListNode(rem);
        int carry = (l1.val + l2.val) / 10;
        ListNode pointer = head;
        l1 = l1.next;
        l2 = l2.next;
        while(l1 != null && l2 != null){
            int temp = l1.val + l2.val + carry;
            int dig = temp % 10;
            pointer.next = new ListNode(dig);
            carry = temp / 10;
            l1 = l1.next;
            l2 = l2.next;
            pointer = pointer.next;
        } 
        
        if(l1 == null){
            l1 = l2;
        }
        while(carry != 0 && l1 != null){
            int temp = l1.val + carry;
            int dig = temp % 10;
            pointer.next = new ListNode(dig);
            carry = temp / 10;
            l1 = l1.next;
            pointer = pointer.next;
        }
        if(carry != 0){
            pointer.next = new ListNode(carry);
        }
        if(l1 != null){
            pointer.next = l1;
        }
        
        return head;
    }
}