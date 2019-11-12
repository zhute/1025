public class BikeDemo{
	public static void main(String[] args){
		
		Bike bike=new Bike();
		System.out.println(bike.getColor());
		System.out.println(bike.getSpeed());
		
		bike.setColor("粉色");
		System.out.println(bike.getColor());
		for(int i=0;i<22;i++){
			bike.speedUp();
			System.out.println(bike.getSpeed());
		}
		System.out.println("下坡:");
		for (int i = 0; i < 22; i++) {
			bike.speedUp();
			System.out.println(bike.getCurrentSpeed());
		}
		
		System.out.println("上坡:");
		for (int i = 0; i < 22; i++) {
			bike.speedDown();
			System.out.println(bike.getCurrentSpeed());
		}
	}
}
