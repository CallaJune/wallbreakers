# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rangeSumBST(self, root: TreeNode, low: int, high: int) -> int:
        if not root:
            return 0
        toAdd = 0
        if root.val >= low and root.val <= high:
            toAdd += root.val
        return toAdd + self.rangeSumBST(root.left, low, high) + self.rangeSumBST(root.right, low, high)