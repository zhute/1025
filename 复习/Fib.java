package src;

import java.util.Scanner;

public class Fib {
    private static int fib(int n) {
        if (n < 2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        while (true) {
            int n = Sc.nextInt();
            System.out.println(fib(n));
        }
    }
}
