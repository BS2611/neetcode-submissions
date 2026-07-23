# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        current = head
        length =0
        while current:
            length+=1
            current = current.next
        
        for i in range(0,length//2,1):
            head = head.next
        return head

