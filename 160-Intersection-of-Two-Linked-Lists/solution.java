/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        int diff = 0;
        ListNode first = headA;
        ListNode second = headB;
        boolean firstLong = true;
        while(first.next != null && second.next != null){
            first = first.next;
            second = second.next;
        }
        if(first.next != null){
            while(first.next != null){
                diff++;
                first = first.next;
            }
        }
        if(second.next != null){
            while(second.next != null){
                diff++;
                second = second.next;
            }
            firstLong = false;
        }
        if(firstLong){
            first = headA;
            second = headB;
        }else{
            second = headA;
            first = headB;
        }
        while(diff>0){
            first = first.next;
            diff--;
        }
        while(first != null){
            if(first == second) return first;
            else{
                first = first.next;
                second = second.next;
            }
        }
            
        return null;
        
    }
}