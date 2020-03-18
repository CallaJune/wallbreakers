/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        postorder(root, list);
        return list;
    }
    
    public void postorder(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.children.size() == 0) {
            list.add(root.val);
            return;
        }
        for (Node node : root.children) {
            postorder(node, list);
        }
        list.add(root.val);
    }
}