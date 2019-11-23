public class Solution {
    public int getLength(ListNode head){
        int size=0;
        for(ListNode n=head;n!=null;n=n.next){
            size++;
        }
        return size;
    }
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int lengthA=getLength(pHead1);
        int lengthB=getLength(pHead2);
        int sum=lengthA-lengthB;
        ListNode longger=pHead1;
        ListNode shorter=pHead2;
        if(lengthA   <lengthB   ){
            longger=pHead2;
            shorter=pHead1;
            sum=lengthB-lengthA;
        }
        for(int i=0;i<sum;i++){
            longger=longger.next;
        }
        while(longger!=shorter){
            longger=longger.next;
            shorter=shorter.next;
        }
        return longger;
    }
}