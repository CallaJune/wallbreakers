/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int l = 0;
        ListNode current = head;
        while (current != null) {
            l++;
            current = current.next;
        }
        if (l < k) {
            return head;
        }
        int n = l / k;
        ListNode pre = new ListNode(0);
        ListNode node, remaining, result = pre;
        for (int i = 0; i < n; i++) {
            node = null;
            remaining = head;
            for (int j = 0; j < k; j++) {
                ListNode nxt = head.next;
                head.next = node;
                node = head;
                head = nxt;
            }
            pre.next = node;
            remaining.next = head;
            pre = remaining;
        }
        return result.next;
}
}