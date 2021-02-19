package baekjoon.function;

public class Ex15596 {
	static long sum(int[] a) {
		long sum = 0L;
		
		for(int i : a) {
			sum += (long) i;
		}
		
		return sum;
	}
}
