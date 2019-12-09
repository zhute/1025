public class Queue {
    Node head=null;
    Node last=null;
    int size=0;
    public void offer(int v){
        Node node=new Node(v);
        if(last==null){
            head=node;
        }else{
            last.next=node;
        }
        last=node;
        size++;
    }
    public void poll(){
        if(size==0){
            return;
        }
        if(head==null){
            last=null;
        }
        size--;
    }
    public int peek(){
        if(size==0){
            return 0;
        }
        return head.val;
   }
   public int size(){
        return size;
   }
   public boolean isEmpty(){
        return size==0;
   }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.offer(2);
        q.offer(1);
        q.offer(3);
        q.offer(5);
        System.out.println(q.size());
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.poll();
        }
        System.out.println(q.isEmpty());
    }
}
