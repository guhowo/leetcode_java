/**
 * leetcode 21. 合并两个有序链表
 * https://leetcode.cn/problems/merge-two-sorted-lists/description/
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        dummy.next = null;
        ListNode p1 = list1, p2 = list2;
        ListNode p = dummy;

        while(p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }

        if(p1!=null) {
            p.next = p1;
        }
        if (p2!=null) {
            p.next = p2;
        }

        return dummy.next;
    }
}
