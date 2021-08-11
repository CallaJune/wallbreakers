# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root:
            return root
        invertRight = self.invertTree(root.right)
        invertLeft = self.invertTree(root.left)
        root.left = invertRight
        root.right = invertLeft
        return root