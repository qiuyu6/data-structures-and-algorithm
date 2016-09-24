/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        if(head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        if(head.next.next == null){
            if(head.val == head.next.val) return true;
            else return false;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        int odd = 0;
        if(fast != null){
            if(fast.next == null){
                slow = slow.next;
                odd = 1;
            } 
        } 
        fast = head;
        Stack<ListNode> stack = new Stack<ListNode>();
        while(slow != null){
            stack.push(fast);
            fast = fast.next;
            slow = slow.next;
        }
        if(odd == 1) fast = fast.next;
        while(!stack.isEmpty()){
            ListNode temp = stack.pop();
            if(fast.val != temp.val) return false;
            fast = fast.next;
        }
        return true;
    }
}