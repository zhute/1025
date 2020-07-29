package src;

public class 富翁 {
    public static void main(String[] args) {
        long x=0;
        long y=0;
        for (int i=1;i<=30;i++){

            y+=(long)Math.pow(2,i-1);


        }
        x=10*30;
        System.out.println(x+"万元");
        System.out.println(y+"分");
    }
}
