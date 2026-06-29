# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return head
        odd_head = None
        odd = None
        even_head = None
        even = None
        current = head
        position = 1
        while current:
            if position % 2 == 0:
                if even_head == None:
                    even_head = current
                    even = current
                else:
                    even.next = current
                    even = even.next
            else:
                if odd_head == None:
                    odd_head = current
                    odd = current
                else:
                    odd.next = current
                    odd = odd.next
            current = current.next
            position += 1
        if even:
            even.next = None
        odd.next = even_head
        return odd_head
        