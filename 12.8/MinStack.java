import java.util.Stack;
public class MinStack {

    Stack<Integer> minStack;
    Stack<Integer> stack;
    MinStack() {
        Stack minStack= new Stack();
        Stack stack= new Stack();
    }

    void push(int x) {
        if(minStack.isEmpty()||x<=minStack.peek()){
            minStack.push(x);
        }
        stack.push(x);
    }

    void pop() {
        int ret=stack.peek();
        if(ret==minStack.peek()){
            minStack.pop();
        }
        stack.pop();

    }
    int  top(){
        return stack.peek();
    }

    int getMin() {
        return minStack.peek();
    }
};