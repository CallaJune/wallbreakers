/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        // If list has two or less items, return head
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        /* Create pointers to prepare to create two lists: one odd,
         * and one even. The head of the list can store the beginning
         * of the odd list, but we create a pointer to separately
         * remember the first even item.
         */
        ListNode oddTracker = head;
        ListNode evenHead = head.next;
        ListNode evenTracker = evenHead;
        // Start iterating at the third node
        ListNode current = head.next.next;
        // We start on the third node, which is not even
        boolean even = false;
        while (current != null) {
            // If current node should be added to the even list
            if (even) {
                evenTracker.next = current;
                evenTracker = evenTracker.next;
            // If current node should be added to the odd list
            } else {
                oddTracker.next = current;
                oddTracker = oddTracker.next;
            }
            // Update current and flip boolean
            current = current.next;
            even = !even;
        }
        // Attach the even list to the end of the odd list
        evenTracker.next = null;
        oddTracker.next = evenHead;
        // Return the first item in the list
        return head;
    }
}