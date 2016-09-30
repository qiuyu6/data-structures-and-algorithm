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
        ListNode walk = head;
        Stack<ListNode> stack = new Stack<>();
        while(walk.next != null){
            stack.push(walk);
            walk = walk.next;
        }
        ListNode res = walk;
        while(!stack.empty()){
            walk.next = stack.pop();
            walk = walk.next;
        }
        walk.next = null;
        return res;
    }
}