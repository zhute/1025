import java.util.Random;
import java.util.Scanner;
public class GuessGame{
	public static void main(String[] args){
		Random random=new Random();
		Scanner scanner=new Scanner(System.in);
		System.out.println("欢迎进入猜数字游戏");
		int n= random.nextInt(100);
		System.out.println("数字已生成");
		int times=4;
		System.out.println("您有" + times +"次机会");
		for(int i=0;i<=times;i++){
			int x=scanner.nextInt();
			if(x==n){
				System.out.println("正确");
				return;
			}
			else if(x<n){
				System.out.println("第"+ i +"次，小了");
			}else{
				System.out.println("第"+ i +"次，大了");
			}
		}
		System.out.println("Game Over");
		System.out.println("数字是" + n);
	}
}
			
				
		
		