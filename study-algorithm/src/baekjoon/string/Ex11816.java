package baekjoon.string;

import java.io.IOException;
import java.util.Scanner;

public class Ex11816 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scan = new Scanner(System.in);
		String X = scan.next();
		String N = "";
		int N8 = 0;
		int N16 = 0;

		if (X.charAt(0) == '0') {
			if (X.charAt(1) == 'x') {
				for (int i = 2; i < X.length(); i++) {
					N += X.charAt(i);
				}
				N16 = Integer.valueOf(N, 16);
			} else {
				for (int i = 1; i < X.length(); i++) {
					N += X.charAt(i);
				}
				N8 = Integer.valueOf(N, 8);
			}
		} else {
			System.out.println(X);
		}
		if (N8 != 0 || N16 != 0) {
			System.out.println(N8 > N16 ? N8 : N16);
		}
	}

}
