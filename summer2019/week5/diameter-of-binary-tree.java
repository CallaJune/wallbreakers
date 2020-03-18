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
    int longestPath = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return longestPath;
    }
    
    public int maxDepth(TreeNode root){
        if(root == null) {
            return 0;
        }
        // Get the maximum depth of the left side
        int left = maxDepth(root.left);
        // Get the maximum depth of the right side
        int right = maxDepth(root.right);
        // Figure out which is bigger - the current max or the path
        // from the left most to right most
        longestPath = Math.max(left + right, longestPath);
        // Return the depth of the root
        return Math.max(left, right) + 1;
    }
}