public class Array{
	public static int[] copyOf(int[] a, int newLength) {
		int[] dest = new int[newLength];
		int length = Math.min(newLength, a.length);
		for (int i = 0; i < length; i++) {
			dest[i] = a[i];
		}
		
		return dest;
	}
	public static int[] copyOfRange(int[] a, int from, int to) {
		int[] dest = new int[to - from];
		for (int i = from; i < to; i++) {
			dest[i - from] = a[i];
		}
		
		return dest;
	}
	
	public static void fill(int[] a, int val) {
		for (int i = 0; i < a.length; i++) {
			a[i] = val;
		}
	}
	
	public static void fill(int[] a, int from, int to, int val) {
		for (int i = from; i < to; i++) {
			a[i] = val;
		}
	}
	
	public static void equals(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		
		return true;
	}
		
	
		