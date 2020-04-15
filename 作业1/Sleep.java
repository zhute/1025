public class Sleep {
    private int data;
    int result = 0;

    public void m() {
        result += 2;
        data += 2;
        System.out.println(result + "" + data);
    }

}
class ThreadExample extends Thread {
    private Sleep mv;

    public ThreadExample(Sleep mv) {
        this.mv = mv;

    }

    public void run() {
        synchronized (mv) {
            mv.m();
        }
    }

}
class ThreadTest{

    public static void main(String[] args) {
       Sleep mv=new Sleep();
       Thread t1=new ThreadExample(mv);
        Thread t2=new ThreadExample(mv);
        Thread t3=new ThreadExample(mv);
        t1.start();
        t2.start();
        t3.start();
    }
}

