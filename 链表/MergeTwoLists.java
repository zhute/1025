public class MergeTwoLists {
    private static Node mergeTwoLists(Node list1, Node list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        // 定义了两个引用，用来遍历链表
        Node cur1 = list1;
        Node cur2 = list2;

        // 新链表的头结点和尾结点
        // 空链表，所以都是 null
        Node nHead = null;
        Node nLast = null;

        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                // 把 cur1 尾插到新链表 开始
                if (nHead == null) {    // 如果新链表为空（只有第一次插入才是空的）
                    nHead = cur1;
                } else {
                    nLast.next = cur1;
                }
                nLast = cur1;   // 更新新链表的尾结点是新插入的结点
                // 把 cur1 尾插到新链表 结束

                cur1 = cur1.next;   // 让 cur1 后移一步
            } else {
                if (nHead == null) {
                    nHead = cur2;
                } else {
                    nLast.next = cur2;
                }
                nLast = cur2;
                cur2 = cur2.next;
            }
        }

        // 有一个链表为空了
        if (cur1 != null) {
            nLast.next = cur1;
        } else {
            nLast.next = cur2;
        }

        return nHead;
    }

    public static void main(String[] args) {
        Node n5 = new Node(5);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);
        // 1 2 3 4 5

        Node m3 = new Node(13);
        Node m2 = new Node(7, m3);
        Node m1 = new Node(0, m2);
        // 0 7 13

        Node result = mergeTwoLists(n1, m1);
        printList(result);
    }

    private static void printList(Node head) {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.println(cur);
        }
    }
}
