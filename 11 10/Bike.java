/* public class Bike{
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
} */
public class Bike {
	// 属性
	private String color;			// 颜色
	private int currentSpeed;		// 当前速度
	private int maxSpeed;			// 最高速度
	
	// 构造方法
	Bike() {
		color = "黑色";
		currentSpeed = 0;
		maxSpeed = 193;
	}
	
	Bike(String color) {
		color = color;
		currentSpeed = 0;
		maxSpeed = 193;
	}
	
	// 方法
	// setter
	void setColor(String color) {
		this.color = color;
	}
	
	void speedUp() {
		currentSpeed += 10;
		if (currentSpeed > maxSpeed) {
			currentSpeed = maxSpeed;
		}
	}
	
	void speedDown() {
		currentSpeed -= 10;
		if (currentSpeed < 0) {
			currentSpeed = 0;
		}
	}
	
	// getter
	String getColor() {
		return color;
	}
	
	int getCurrentSpeed() {
		return currentSpeed;
	}
}
