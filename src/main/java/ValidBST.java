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
    List<Integer> list = new ArrayList<>();
    public boolean isValidBSTV2(TreeNode root) {
        traverse(root);
        for (int i=0; i<list.size()-1; i++) {
            if (list.get(i) >= list.get(i+1)) {
                return false;
            }
        }

        return true;
    }

    void traverse(TreeNode root) {
        if (root==null) {
            return;
        }
        traverse(root.left);
        list.add(root.val);
        traverse(root.right);
    }
}
