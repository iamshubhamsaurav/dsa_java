package leetcode_ques.trees;

public class MaxDepth {
    
     // max depth is just the height of binary tree
     public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
