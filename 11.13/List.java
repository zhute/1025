import java.util.Arrays;
public class List{
	private int[] array;
	private int size;
	
	List(){
		array=new int[10];
		size=0;
	}
	//尾插
	public void pushBack(int v){
		array[size]=v;
		size++;
	}
	//尾删
	public void popBack(){
		
		array[size]=0;
		size--;
	}
	
	public void pushFront(int c){
		for(int i=size;i>=1;i--){
			array[i]=array[i-1];
		}
		array[0]=c;
		size++;
	}
	
	@Override
	public String toString(){
		return Arrays.toString(array);
	}
	
	public static void main(String[] args){
		List list=new List();
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushFront(20);
		list.pushFront(30);
		list.pushFront(10);
		System.out.println(list);
	}
}
	