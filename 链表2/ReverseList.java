public class ReverseList {
    // 60% 情况可能会让写的
    public Node reverseList(Node head) {
        Node nHead = null;  // 新建一个链表，nHead 是头结点
        Node cur = head;
        while (cur != null) {
            Node next = cur.next;
            // 把 cur 头插到 nHead 所代表的链表上去
            cur.next = nHead;
            nHead = cur;

            cur = next;
        }

        return nHead;
    }

    private static Node buildList() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        return n1;
    }

    public static void main(String[] args) {
        Node head = buildList();
        ReverseList object = new ReverseList();
        Node rHead = object.reverseList(head);

        printList(rHead);
    }

    private static void printList(Node head) {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.println(cur);
        }
    }
}
