

public class Partition {
    public ListNode partition(ListNode pHead,int x){
        ListNode sHead=new ListNode();
        ListNode sLast=sHead;
        ListNode bHead=new ListNode();
        ListNode bLast=bHead;

        ListNode cur=pHead;
        while(cur!=null){
            if(cur.val<x) {
                sLast.next = cur;
                sLast = cur;
            }else{
                bLast.next=cur;
                bLast=cur;
            }
            cur=cur.next;
        }
            sLast.next=bHead.next;
            bLast.next=null;
            return sHead.next;
    }
}
