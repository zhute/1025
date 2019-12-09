import java.util.Arrays;

public class Stack {


    int [] array;
    int size;
    public Stack(int n){
        array=new int[n];
        size=0;
    }
    public void push(int v){
        if(size==array.length){
            array=Arrays.copyOf(array,2*size);
        }
        array[size++]=v;
    }
    public void pop() {
        if (size > 0)
            size--;
    }

    public int peek(){
            return array[size-1];

        }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public static void main(String[] args) {
        Stack s=new Stack(6);
        s.push(3);
        s.push(2);
        s.push(5);
        s.push(7);
        System.out.println(s.size());
        System.out.println(s.peek());
    }

}
