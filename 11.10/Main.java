class Person{
	int age;
	String name;
	
	public void sayHello(String target){
		System.out.println(name + " say hello to " + target);
	}
	
}
public class Main{
	public static void main(String[] args){
		Person p=new Person();
		p.name="强强";
		p.age=20;
		p.sayHello("大苏打");
	}
}