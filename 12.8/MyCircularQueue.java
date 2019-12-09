public class MyCircularQueue {
        private int[] array;
        private int front;
        private int rear;


        public MyCircularQueue(int k) {
            array = new int[k + 1];
            front = 0;
            rear = 0;
        }


        public boolean enQueue(int value) {
            if (!isEmpty()) {
                array[rear] = value;
                rear = (rear + 1) % array.length;
                return true;
            } else {
                return false;
            }
        }


        public boolean deQueue() {
            if (!isEmpty()) {
                front = (front + 1) % array.length;
                return true;
            } else {
                return false;
            }
        }


        public int Front() {
            if (!isEmpty()) {
                return array[front];
            } else {
                return -1;
            }
        }


        public int Rear() {
            if (!isEmpty()) {
                return rear = 0;

            } else {
                return -1;
            }
        }


        public boolean isEmpty() {
            return rear % array.length == front % array.length;
        }
    }



