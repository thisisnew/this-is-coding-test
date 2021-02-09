package baekjoon.string;

import java.util.Scanner;

public class Ex11729 {
	public static void main(String[] args) throws Exception {
		int total = 0;
		int n = 0;
		String words = "";
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.nextLine();
		words = scanner.nextLine();
		
		for(int i=0; i<n; i++) {
			total += Character.getNumericValue(words.charAt(i));
		}
		
		System.out.println(total);
	}
}
