import java.util.Scanner;

public class 多线程阻塞的场景 {
    private static long fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1) +fib(n-2);

    }

    private static class FibThread extends Thread{
        private int n;
        FibThread(int n){
            this.n=n;
        }
        @Override
        public void run(){
            System.out.println(fib(n));
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            int n=scanner.nextInt();
            //System.out.println(fib(n));//主线程直接计算
            FibThread thread=new FibThread(n);
            thread.start();
        }
    }
}
