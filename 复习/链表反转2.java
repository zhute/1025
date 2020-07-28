public class 链表反转2 {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode nheda = null;

        while (head != null) {
            //1.拿下原链表头节点
            ListNode p = head;
            head = head.next;
            //2.插入新新链表
            p.next = nheda;
            nheda.next = p;
        }
        return nheda;
    }
}
