
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("����","³Ѹ");
        map.put("����","�����ռ�");
        map.put("����ʱ��","1918");
        for (Map.Entry<String,String> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+"---->"+entry.getValue());
        }
        map.put("����ʱ��","1918");
        map.put("ҳ��","300");
        for (Map.Entry<String,String> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+"---->"+entry.getValue());
        }
    }
}
