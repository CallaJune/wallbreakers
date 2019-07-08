/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        return recursive(head);
    }
    
    public ListNode recursive(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode remaining = recursive(head.next);
        head.next.next = head;
        head.next = null;
        return remaining;
    }
}