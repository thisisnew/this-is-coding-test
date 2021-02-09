package baekjoon.string;

import java.util.Scanner;

public class Ex2577 {
	public static void main(String[] args) {
		int a, b, c, total;
		int cnt = 0;
		int[] arr = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		total = a * b * c;
		
		while(total > 0) {
			arr[total % 10]++;
			total /= 10;
		}
		
		for(int n : arr) {
			System.out.println(n);
		}
		
	}
}
