public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null){
            retrun list2;
        }else if(list2==null){
            return list1;
        }
        listNode list=null;
        if(list1,val<=list2.val){
            list=list1;
            list.next=Merge(list1,list2.next);
            
        }
        if(list2.val<list1.val){
            list=list2;
            list.next=Merge(list1,list2.next);
        }
        return list;
    }
}