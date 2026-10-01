import java.util.ArrayList;
import java.util.List;

/**
 * 143. 重排链表  https://leetcode.cn/problems/reorder-list/description/
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();

        ListNode p = head;
        while (p != null) {
            nodes.add(p);
            p = p.next;
        }

        ListNode cur = new ListNode();
        for(int i=0, j=nodes.size()-1; i<=j; i++, j--) {
            ListNode left = nodes.get(i);
            ListNode right = nodes.get(j);
            left.next = right;
            right.next = null;
            cur.next = left;
            cur = right;
        }
    }
}
