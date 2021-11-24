package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13235 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		boolean isP = true;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			char reverseC = input.charAt(input.length() - 1 - i);

			if (c != reverseC) {
				isP = false;
				break;
			}
		}

		if (isP) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
