/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        // Start the index at the last list in lists
        int index = lists.length - 1;
        while (index >= 0) {
            for (int i = 0; i <= index; i++) {
                if (lists[i] != null) {
                    // Add the current list node value to the priority queue
                    q.add(lists[i].val);
                    // Move on along the linked list
                    lists[i] = lists[i].next;
                }
                else {
                    /* If current list item is null, assign it to the last item
                     * currently being looked at, which at this point is the last index
                     */
                    lists[i] = lists[index--];
                }
            }
        }

        ListNode temp = new ListNode(-1);
        ListNode prev = temp;
        // Convert the priority queue into a linked list
        while (!q.isEmpty()) {
            prev.next = new ListNode(q.poll());
            prev = prev.next;
        }
        return temp.next;
    }
}