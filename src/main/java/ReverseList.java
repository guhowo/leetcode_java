/**
 * leetcode 206. 反转链表
 * https://leetcode.cn/problems/reverse-linked-list/description/
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = null;
        ListNode cur = head;

        while(cur != null) {
            ListNode next = cur.next;
            cur.next = dummy.next;
            dummy.next = cur;

            cur = next;
        }

        return dummy.next;
    }

    class ListNode {
      int val;

      ListNode next;

      ListNode() {}

      ListNode(int val) {
          this.val = val;
      }

      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
  }
}
