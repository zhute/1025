import java.util.ArrayList;
public class UseArrayList{
	public static void main(String[] args){
		ArrayList<String> list=new ArrayList<>(100);
		list.add("qq");
		list.add(0,"hh");
		System.out.println(list);
		String s0=list.get(0);
		System.out.println(s0);
		list.set(0."ss");
		System.out.println(list);
	}
}