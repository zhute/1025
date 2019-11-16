import java.util.Scanner;

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	private boolean b24 = false;
	
	public MyTime(int hour, int minute, int second) {
		if (hour < 0 || hour > 23) {
			return;
		}
		
		if (minute < 0 || minute > 59) {
			return;
		}
		
		if (second < 0 || second > 59) {
			return;
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	@Override
	public String toString() {
		if (b24) {
			return String.format("%02d:%02d:%02d", hour, minute, second);
		} else {
			
			String amOrPm = "AM";
			if (hour >= 12) {
				amOrPm = "PM";
			}
			
			int h = hour;
			if (h == 0) {
				h = 12;
			} else if (h > 12) {
				h -= 12;
			}
			return String.format("%s %02d:%02d:%02d", amOrPm, h, minute, second);
		}
	}
	
	public void setB24() {
		b24 = true;
	}
	
	public void setB12() {
		b24 = false;
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
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请按照 24 小时制输入");
		System.out.println("请输入时:");
		int hour = scanner.nextInt();
		System.out.println("请输入分:");
		int minute = scanner.nextInt();
		System.out.println("请输入秒:");
		int second = scanner.nextInt();
		MyTime t = new MyTime(hour, minute, second);
		
		while (true) {
			System.out.println("12 还是 24");
			int select = scanner.nextInt();
			if (select == 1) {
				t.setB12();
			} else {
				t.setB24();
			}
		
			System.out.println("加 还是 减");
			select = scanner.nextInt();
			System.out.println("秒数");
			int seconds = scanner.nextInt();
			if (select == 1) {
				t.add(seconds);
			} else {
				t.sub(seconds);
			}
			System.out.println(t);
		}
	}
}

















