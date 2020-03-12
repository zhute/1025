

import java.util.Arrays;

public class Template<E> {
}
class MyArrayList<E> {

    private E[] array;
    private int size;
    private int capacity;

    public MyArrayList() {
        array = (E[]) new Object[10];
        size = 0;
        capacity = 10;
    }

    public void add(E value) {
        if (size == capacity) {
            array = Arrays.copyOf(array, 2 * capacity);
            capacity *= 2;
        }
        array[size++] = value;
    }

    public E remove() {
        E ret;
        if (size > 0) {
            ret = array[size - 1];
            array[size - 1] = null;
            --size;
            return ret;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }

    }

}
    class Mylist<E>{
      private static class Node<E>{
          private E value;
          Node<E> next;
          private Node(E value){
              this.value=value;
              next=null;
          }
      }
      private Node<E>head=null;


      public void pushFront(E value){
          if(head==null){
              head=new Node<>(value);
          }else{
              Node<E> node=new Node<>(value);
              node.next=head;
              head=node;
          }
      }
      public E popFront(){
          E ret=head.value;
          head=head.next;
          return ret;
      }
                    }