
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("作者","鲁迅");
        map.put("标题","狂人日记");
        map.put("发表时间","1918");
        for (Map.Entry<String,String> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+"---->"+entry.getValue());
        }
        map.put("发表时间","1918");
        map.put("页数","300");
        for (Map.Entry<String,String> entry:map.entrySet())
        {
            System.out.println(entry.getKey()+"---->"+entry.getValue());
        }
    }
}
