import java.util.LinkedList;
import java.util.Queue;

/**
 * leetcode 104.二叉树的最大深度
 * https://leetcode.cn/problems/maximum-depth-of-binary-tree/description/
 */
public class MaxDepth {

    //方法1：深度优先遍历
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int rightDepth = maxDepth(root.right);
        int leftDepth = maxDepth(root.left);
        return Math.max(rightDepth, leftDepth) + 1;
    }

    //方法2：广度优先遍历
    public int maxDepthV2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int ans = 0;
        while(!queue.isEmpty()) {
            ans++;
            int levelSize = queue.size();
            while (levelSize > 0) {
                levelSize--;
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return ans;
    }
}
