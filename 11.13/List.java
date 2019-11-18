import java.util.Arrays;
public class List{
	private int[] array;
	private int size;
	
	List(){
		array=new int[10];
		size=0;
	}
	//尾插O（1）
	public void pushBack(int v){
		if(!checkCapacity(1)){
		ensureCapacity();
		}
		array[size]=v;
		size++;
	}
	//尾删
	public void popBack(){
		
		array[size]=0;
		size--;
	}
	
	public void pushFront(int c){
		if(!checkCapacity(1)){
		ensureCapacity();
		}
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
	//o（n）
	public void insert(int x,int index){
		if(size==0){
			System.out.println("空了");
			return;
		}
		for(int i=size-1;i>=index;i--){
			array[i+1]=array[i];
		}
		array[index]=x;
	}
	
	@Override
	public String toString(){
		return Arrays.toString(array);
	}
	
	private boolean checkCapacity(int num){
		return size+num<=array.length;
	}
	private void ensureCapacity(){
		int newLength=array.length*2;
		int[] newArray=new int[newLength];
		for (int i=0;i<size;i++){
			newArray[i]=array[i];
		}
		array=newArray;
	}
		public int get(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		return array[index];
	}
	
	public int set(int index, int element) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		int old = array[index];
		array[index] = element;
		return old;
	}
	
	public static void main(String[] args){
	List list = new List(2);
		list.pushBack(1);
		list.pushBack(2);
		System.out.println(list.array.length);
		list.pushBack(3);
		System.out.println(list.array.length);
		list.pushBack(4);
		System.out.println(list.array.length);
		list.pushBack(5);
		System.out.println(list.array.length);
		list.pushBack(6);
		list.pushBack(7);
		System.out.println(list.array.length);
	}
}

	