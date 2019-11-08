public class MaxDepthTreeNode {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int depth = 1;
        depth += Math.max(maxDepth(root.left), maxDepth(root.right));
        return depth;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}


