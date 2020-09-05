package src;

public class 链表是否有环 {
        public boolean hasCycle(ListNode head) {
            if(head==null)
                return false;
            ListNode fast=head;
            ListNode last=head;
            while(fast!=null&&fast.next!=null){
                fast=fast.next.next;
                last=last.next;
                if(fast==last)
                    return true;
            }
            return false;
        }
    }
