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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> sequence1 = new ArrayList<>();
        leafValueSequence(root1, sequence1);
        List<Integer> sequence2 = new ArrayList<>();
        leafValueSequence(root2, sequence2);
        return sequence1.equals(sequence2);
    }
    
    public void leafValueSequence(TreeNode root, List<Integer> sequence) {
        if (root.left == null && root.right == null) {
            sequence.add(root.val);
        }
        if (root.left != null) {
            leafValueSequence(root.left, sequence);
        }
        if (root.right != null) {
            leafValueSequence(root.right, sequence);
        }
    }
}