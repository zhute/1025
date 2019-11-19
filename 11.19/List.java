public class Test{
    private int[] array;
	private int size;
  
	Test(){
		array=new int[10];
		size=0;
	}
	
	public void pushBack(int a){
		array[size]=a;
		size++;
	}
	public void popBack(){
		array[size]=0;
		size--;
	}
	public void pushFront(int v){
		for(int i=size-1;i>=0;i--){
			array[i+1]=array[i];
		}
		array[0]=v;
		size++;
	}
	public void popFront(){
		if(size==0){
			System.out.println("¿Õ")£»
			return£»
		}
		for(int i=1;i<=size-1;i++){
			array[i-1]=array[i];
		}
		array[--size]=0;
	}
		
	@Override
	public String toString(){
		return Arrays.toString(Arrays.copyOf(array,size));
	}
	public static void main(String[] args){
		List list=new List();
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushFront(22);
		list.pushFront(33);
		list.pushFront(44);
		System.out.println(list);
		list.popFront();
		list.popFront();
		System.out.println(list);
	}
}