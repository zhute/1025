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
	void popFront(){
		if(size==0){
			System.out.println("空了");
			return;
		}
		for(int i=1;i<=size-1;i++){
			array[i-1]=array[i];
		}
		array[size]=0;
		size--;
	}
	
	public void insert(int x,int index){
		for(int i=size-1;i>=index;i--){
			array[i+1]=array[i];
		}
		array[index]=x;
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
		list.insert(55,2);
		System.out.println(list);
	}
}
	