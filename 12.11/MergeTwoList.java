public class MergeTwoList {
        private static Node mergeTwoLsit(Node list1,Node list2){
            if(list1==null){
                return list2;
            }
            if(list2==null){
                return list1;
            }
            Node cur1=list1;
            Node cur2=list2;
            Node nHead=null;
            Node nLast=null;
            while(cur1!=null&&cur2!=null){
                if(cur1.val==cur2.val){
                    if(nHead==null){
                        nHead=cur1;
                    }else{
                        nLast.next=cur1;
                    }
                    nLast=cur1;
                    cur1=cur1.next;
                }else{
                    if(nHead==null){
                        nHead=cur2;
                    }else{
                        nLast.next=cur2;
                    }
                    nLast=cur2;
                    cur2=cur2.next;
                }
            }
            if(cur1!=null){
                nLast.next=cur1;
            }else{
                nLast.next=cur2;
            }
            return nHead;
        }

    public static void main(String[] args) {
        Node n5=new Node(8);
        Node n4=new Node(6);
        Node n3=new Node(7);
        Node n2=new Node(5);
        Node n1=new Node(4);
        Node m3=new Node(12);
        Node m2=new Node(2);
        Node m1=new Node(3);
        Node result=mergeTwoLsit(n1,m1);
        printList(result);



    }

    private static void printList(Node head) {
            for(Node cur=head;cur!=null;cur=cur.next){
                System.out.println(cur);
            }
    }
}
