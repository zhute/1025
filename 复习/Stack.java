import java.util.Arrays;

public class Stack {
    private int[] array;
    private int size;
    public Stack(int n){
        array=new int[n];
        size=0;
    }
    public void push(int value){
        if(size==array.length){
            array=Arrays.copyOf(array,2*size);

        }
        array[size++]=value;
    }
    public void pop(){
        if(size>0)
        size--;
    }
    public int peek(){
        return array[size-1];

    }
    public int size(){
        return size;
    }
}
