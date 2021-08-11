# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def leafSimilar(self, root1: Optional[TreeNode], root2: Optional[TreeNode]) -> bool:
        return self.getLeaves(root1) == self.getLeaves(root2)
    
    def getLeaves(self, root) -> List[int]:
        if not root:
            return []
        leftSide = self.getLeaves(root.left)
        currentVal = []
        if not root.left and not root.right:
            currentVal.append(root.val)
        rightSide = self.getLeaves(root.right)
        return leftSide + currentVal + rightSide