import java.util.Scanner;
public class Apple{
    public static int buyApple(int n) {
        if (n < 6 || n % 2 != 0) {
            return -1;
        }
        if (n % 8 == 0) {
            return n / 8;
        }

            return n / 8 + 1;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(buyApple(n));

    }

}