# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumOfLeftLeaves(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        total = 0
        if root.left:
            if self.isLeaf(root.left):
                total += root.left.val
            else:
                total += self.sumOfLeftLeaves(root.left)
        if root.right:
            total += self.sumOfLeftLeaves(root.right)
        return total
    
    def isLeaf(self, node: Optional[TreeNode]) -> bool:
        if node and node.left is None and node.right is None:
            return True