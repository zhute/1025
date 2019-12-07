public class StringInPool {
    public static void main(String[] args) {
        String s="hello";
        String p="hello";
        String q="hello";

        System.out.println(s==p);
        System.out.println(s==q);
        //判断字符串是否相等
        System.out.println(s.equals(p));
        System.out.println(s.equals(q));
        String s1="hello";
        String p1=new String(s1);
        String q1=new String(s1);
        System.out.println(s1==q1);
        System.out.println(s1==p1);
    }
}
