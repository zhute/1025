public class Dog extends Animal {
    Dog(){
        super();
    }
    public void scream() {
        System.out.println("中心城市");
    }
    public static void main(String[] args) {
        Animal a=new Dog();
        Dog b=new Dog();
        a.scream();
        b.scream();
    }
}
