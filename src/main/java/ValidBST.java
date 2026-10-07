import java.util.ArrayList;
import java.util.List;

/**
 * leetcode 98.验证二叉搜索树
 * https://leetcode.cn/problems/validate-binary-search-tree/
 */
public class ValidBST {

    //方法一：递归
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean isValidBST(TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;
        }

        if (node.val <= lower || node.val >= upper) {
            return false;
        }

        return isValidBST(node.left, lower, node.val) && isValidBST(node.right, node.val, upper);
    }

    //方法二：中序遍历
    Integer last = null;
    boolean ans = true;
    public boolean isValidBSTV2(TreeNode root) {
        traverse(root);
        return ans;

    }

    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        if (last != null && last >= root.val) {
            ans = false;
            return;
        }
        last = root.val;
        traverse(root.right);
    }
}
