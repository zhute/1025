
public class 链表合并 {
    public ListNode MergeList(ListNode head1, ListNode head2) {
        if (head1 == null) {
            return head2;
         }
        if (head2 == null) {
                return head1;
            }
            ListNode nhead = null;
            ListNode nlast = null;
            while (head1 != null && head2 != null) {
                ListNode p = head1.val < head2.val ? head1 : head2;
                if (p == head1) {
                    head1 = head1.next;
                } else {
                    head2 = head2.next;
                }
                if (nhead == null) {
                    //新链表为空
                    nhead = p;
                    nlast = p;
                } else {
                    //新链表不为空
                    nlast.next = p;
                    nlast = p;
                }
            }
            if (head1 == null) {
                nlast.next = head2;
            }
            if (head2 == null) {
                nlast.next = head1;
            }

            return nhead;

        }
    }



