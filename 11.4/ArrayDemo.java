import java.util.Arrays;

public class ArrayDemo {

	
	public static int max2(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	
	public static double average(int[] a) {
		int sum = 0;
		for (int v : a) {
			sum += v;
		}
		
		return (double)sum / a.length;
	}
	
	// 在数组 a 中查找 v 第一次出现的下标
	 
	public static int indexOf(int[] a, int v) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == v) {
				return i;
			}
		}
		
		return -1;
	}
	
	// 在数组 a 中查找 v 最后一次出现的下标
	 
	public static int lastIndexOf(int[] a, int v) {
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] == v) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	/*
	 * 复制给定的数组，参数中会给出需要复制的下标范围
	 * from: 起始下标
	 * to: 终止下标
	 * [from, to)
	 */
	public static int[] copyOfRange(int[] a, int from, int to) {
		int[] b = new int[to - from];
		for (int i = from; i < to; i++) {
			b[i - from] = a[i];
		}
		return b;
	}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int[] a = { 4, 2, 1, 9, 8, 3, 7 };
		System.out.println(max1(a));
		System.out.println(max2(a));
		System.out.println(average(a));
		//a = { 5, 1, 2, 4, 3, 8, 5, 2 };	// 只能初始化，不能赋值
		int[] b = { 5, 1, 2, 4, 3, 8, 5, 2 };
		System.out.println(indexOf(b, 5));
		System.out.println(lastIndexOf(b, 5));
		int[] a = { 1, 3, 4, 2, 6 };
		int[] b = copyOfRange(a, 1, 3);
		System.out.println(Arrays.toString(b));
	}
}



