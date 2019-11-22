public class PalindromList {
    public int getLength(ListNode head) {
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }

        return count;
    }
    public ListNode getMiddle(ListNode head) {
        int length = getLength(head);
        int half = length / 2;
        ListNode cur = head;
        for (int i = 0; i < half; i++) {
            cur = cur.next;
        }

        return cur;
    }

    public ListNode reverseList(ListNode head) {
        ListNode nHead = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;

            cur.next = nHead;
            nHead = cur;

            cur = next;
        }

        return nHead;
    }
    public boolean chkPalindrome(ListNode A) {
        ListNode middle = getMiddle(A);
        ListNode rHead = reverseList(middle);
        ListNode c1 = A;
        ListNode c2 = rHead;

        while (c1 != null && c2 != null) {
            if (c1.val != c2.val) {
                return false;
            }

            c1 = c1.next;
            c2 = c2.next;
        }

        return true;
    }
}
