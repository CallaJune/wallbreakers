# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def oddEvenList(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        
        odd = head
        even = head.next
        evenTurn = False
        
        oddHead = odd
        evenHead = even
        current = head.next.next
        
        while current:
            if evenTurn:
                even.next = current
                even = even.next
            else:
                odd.next = current
                odd = odd.next
            
            current = current.next
            evenTurn = not evenTurn
            
        even.next = None
        odd.next = evenHead
        return oddHead