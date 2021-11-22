package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5598 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		for (int i = 0; i < input.length(); i++) {

			char c = input.charAt(i);
				
			int n = c;
			n = n - 3;

			if (n < 65) {
				n = 90 - n;
			}

			System.out.print((char) n);

		}
	}
}
