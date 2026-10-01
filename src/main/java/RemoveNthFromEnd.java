import java.util.*;

/**
 * leetcode 19. 删除链表的倒数第 N 个结点
 * https://leetcode.cn/problems/remove-nth-node-from-end-of-list/description/
 */
public class RemoveNthFromEnd {

    //使用栈
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Deque<ListNode> stack = new LinkedList<ListNode>();

        ListNode dummy = new ListNode(0, head);
        ListNode p = dummy;
        while(p != null) {
            stack.push(p);
            p = p.next;
        }

        for (int i=0; i<n; i++) {
            stack.pop();
        }

        ListNode prev = stack.peek();
        if (prev.next != null) {
            prev.next = prev.next.next;
        }

        return dummy.next;
    }

    /**
     * 双指针法
     * 找到倒数N+1个，便于删除，否则删除不方便
     */
    public ListNode removeNthFromEndV2(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);

        ListNode first = dummy;
        ListNode second = dummy;
        for (int i=0; i<n; i++) {
            first = first.next;
        }

        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return dummy.next;
    }
}
