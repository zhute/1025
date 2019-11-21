public class Partition {
    public static Node partition(Node head, int x) {
        Node 小链表的头结点 = null;
        Node 小链表的尾结点 = null;
        Node 大链表的头结点 = null;
        Node 大链表的尾结点 = null;
        Node cur = head;
        while (cur != null) {
            if (cur.val < x) {
                if (小链表的头结点 == null) {
                    小链表的头结点 = cur;
                } else {
                    小链表的尾结点.next = cur;
                }
                小链表的尾结点 = cur;
            } else {
                if (大链表的头结点 == null) {
                    大链表的头结点 = cur;
                } else {
                    大链表的尾结点.next = cur;
                }
                大链表的尾结点 = cur;
            }
            cur = cur.next;
        }

        // 如果小链表为空，返回大链表的头结点
        if (小链表的头结点 == null) {
            return 大链表的头结点;
        }

        // 如果大链表为空
        if (大链表的头结点 == null) {
            return 小链表的头结点;
        }

        小链表的尾结点.next = 大链表的头结点;
        大链表的尾结点.next = null;

        return 小链表的头结点;
    }
}
