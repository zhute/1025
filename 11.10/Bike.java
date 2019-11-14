public class Bike{
	private String color;			
	private int currentSpeed;		
	private int maxSpeed;
	
	Bike(){
		color="黑色";
		speed=0;
		maxSpeed=150;
	}
	Bike(String color){
		color=color;
		speed=0;
		maxSpeed=150;
	}
	
	void setColor(String color){
	    this.color=color;
	}
	
	void speedUp(){
		speed+=10;
		if(speed>maxSpeed){
			speed=maxSpeed;
		}
	}
	
	void speedDown(){
		speed-=10;
		if(speed<0){
			speed=0;
		}
	}
	
	String getColor(){
		return color;
	}
	
	int getSpeed(){
		return speed;
	}
}