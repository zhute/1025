import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> q= new LinkedList<>();


    public MyStack() {
    }

    public void push(int x) {
        q.offer(x);

        }



    public int pop() {
        int size=q.size();
        while(size>1){
            q.offer(q.poll());
            size--;
        }
        return q.remove();
    }

    public int top() {
        return q.peek();
    }
    public boolean empty(){
        return q.isEmpty();

    }
}

