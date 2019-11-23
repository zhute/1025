public class Partition {
    public static ListNode partition(ListNode pHead, int x) {
        // 定义两个链表，链表中自带一个结点
        // 该结点没有业务含义
        // 只是为了避免尾插时需要分情况讨论
        ListNode sHead = new ListNode();
        ListNode sLast = sHead;

        ListNode bHead = new ListNode();
        ListNode bLast = bHead;

        ListNode cur = pHead;
        while (cur != null) {
            if (cur.val < x) {
                sLast.next = cur;
                sLast = cur;
            } else {
                bLast.next = cur;
                bLast = cur;
            }
            cur = cur.next;
        }

        // sHead 所代表的链表（第一个结点是无效结点）
        // bHead 所代表的链表（第一个结点是无效结点）
        sLast.next = bHead.next;
        bLast.next = null;

        return sHead.next;
    }
}
