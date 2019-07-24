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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int result = root.val;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                // Pop node off queue
                TreeNode node = queue.poll();
                // From right to left, set the node to the answer
                // (so we ultimately have the left most node in the row)
                // and add the node to the queue to be processed in the next
                // level
                if (node.right != null) {
                    queue.offer(node.right);
                    result = node.right.val;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                    result = node.left.val;
                }
            }
        }
        return result;
    }
}