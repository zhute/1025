public class 链表反转 {
    public ListNode ReverseList(ListNode head){
         if(head==null || head.next==null){
             return head;
         }
         ListNode left=head;
         ListNode mid=left.next;
         ListNode right=mid.next;

         while(right!=null){
             mid.next=left;
             left=mid;
             mid=right;
             right=right.next;
         }
         mid.next=left;
         head.next=null;
         head=mid;
         return mid;
    }
}
