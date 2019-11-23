public class Practice{
    public ListNode deleteDuplication(ListNode pHeaad){
		if(pHeaad=null){
			return pHeaad;
		}
		ListNode prev=new ListNode(1);
		ListNode fake=prev;
		ListNode cur=pHead;
		ListNode next=pHeaad.next;
		prev.next=pHeaad;
		
		
		while(next!=null){
			if(cur.val!=next.val){
				prev=prev.next;
				cur=cur.next;
				next=next.next;
			}else{
				while(cur.val=next.val){
					next=next.next;
				}
				prev.next=next;
				cur=next;
				if(next!=null){
				next=next.next;
				}
			}
		}
		return fake.next;
	}
}
				
		
  
  