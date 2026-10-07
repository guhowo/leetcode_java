/**
 * leetcode 543. 二叉树的直径
 * https://leetcode.cn/problems/diameter-of-binary-tree/description/
 */
public class DiameterOfBinaryTree {
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return ans-1;
    }

    int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int L = depth(root.left);
        int R = depth(root.right);
        ans = Math.max(ans, L+R+1);
        return Math.max(L, R) + 1;

    }
}
