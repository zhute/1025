package src;
import java.util.Stack;
import java.util.ArrayList;
public class 从尾到头打印链表 {
/**
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 *
 */


        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            Stack<Integer> st = new Stack<>();
            while(listNode != null){
                st.push(listNode.val);
                listNode = listNode.next;
            }
            ArrayList<Integer> list = new ArrayList<>();
            while(!st.empty()){
                list.add(st.pop());
            }
            return list;
        }
    }
