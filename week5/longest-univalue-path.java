/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int solution;
    public int longestUnivaluePath(TreeNode root) {
        solution = 0;
        getLongestPath(root);
        return solution;
    }
    
    public int getLongestPath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getLongestPath(root.left);
        int leftPath = 0;
        if (root.left != null && root.left.val == root.val) {
            leftPath += left + 1;
        }
        int right = getLongestPath(root.right);
        int rightPath = 0;
        if (root.right != null && root.right.val == root.val) {
            rightPath += right + 1;
        }
        solution = Math.max(solution, leftPath + rightPath);
        return Math.max(leftPath, rightPath);
    }
}