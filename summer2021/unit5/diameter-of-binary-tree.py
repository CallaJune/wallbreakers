# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        result = 0
        if not root:
            return result
        leftSide = 0
        if root.left:
            leftSide = self.height(root.left)
        rightSide = 0
        if root.right:
            rightSide = self.height(root.right)
        return max(leftSide + rightSide, max(self.diameterOfBinaryTree(root.left), self.diameterOfBinaryTree(root.right)))
        
    def height(self, root):
        if not root:
            return 0
        return 1 + max(self.height(root.left), self.height(root.right))