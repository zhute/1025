public class Time{
	private int hour;
	private int minute;
	private int second;
	
	public Time(int hour,int minute,int second){
		if(hour<0||hour>23){
			System.out.println("超出范围");
			return;
		}
		if(minute<0||minute>59){
			System.out.println("超出范围");
			return;
		}
		if(second<0||second>59){
			System.out.println("超出范围");
			return;
		}
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	
		@Override
	public String toString(){
		return String.format("%02d-%02d-%02d", hour,minute,second);
	}
	
	public void add(int seconds) {
		second += seconds;
		while (second >= 60) {
			second -= 60;
			minute += 1;
			if (minute >= 60) {
				minute -= 60;
				hour += 1;
				if (hour >= 24) {
					hour -= 24;
				}
			}
		}
	}
	public void sub(int seconds) {
		second -= seconds;
		while (second < 0) {
			second += 60;
			minute -= 1;
			if (minute < 0) {
				minute += 60;
				hour -= 1;
				if (hour < 0) {
					hour = 23;
				}
			}
		}
	}
	
		public static void main(String[] args){
			Time time=new Time(15,34,20);
			System.out.println(time);
			time.add(80);		
			System.out.println(time);
			time.sub(120);		
			System.out.println(time);
		}
	}
	

		