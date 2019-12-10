import java.util.ArrayList;
import java.util.List;

public class TryThrow {
    private static void methdoD(){
        List<String>list=new ArrayList<String>();
        list.get(0);
    }
    private static void methodA(){
        try{
            methdoD();
        }catch(RuntimeException e){
            throw new MyException("woshi",e);
        }
    }
    private static void methodB(){
        methodA();
    }
    private static void methodC(){
        methodB();
    }
    public static void main(String[] args) {
       methdoC();

        }
    }


