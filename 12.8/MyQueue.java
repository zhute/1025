import java.util.Stack;
public class MyQueue{

        Stack<Integer> a;
        Stack<Integer> b;
        MyQueue() {
            a=new Stack<>();
            b=new Stack<>();

        }


        void push(int x) {
            a.push(x);
        }


        int pop() {
            if (b.isEmpty()) {
                int size = a.size();

                for (int i = 0; i < b.size(); i++) {
                    b.push(a.pop());
                }
            }
            return b.pop();
        }
         int peek(){
            if (b.isEmpty()) {
                int size = a.size();

                for (int i = 0; i < b.size(); i++) {
                    b.push(a.pop());
                }
            }
            return b.peek();
        }



        boolean empty() {
            return a.empty() && b.empty();
        }
    }

