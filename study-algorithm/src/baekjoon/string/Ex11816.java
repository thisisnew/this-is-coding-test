package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11816 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		char i0 = input.charAt(0);
		char i1 = input.charAt(1);

		int answer = Integer.parseInt(input);

		if (i0 == '0') {

			if (i1 == 'X') {
				answer = calculateHexadecimalToDeciaml(input);
			} else {
				answer = calculateHexadecimalToDeciaml(input);
			}

		}

		System.out.println(answer);
	}

	static int calculateOctalToDecimal(String input) {
		String result = "";

		for (int i = 1; i < input.length(); i++) {
			result += input.charAt(i);
		}

		return Integer.valueOf(result, 8);
	}

	static int calculateHexadecimalToDeciaml(String input) {
		String result = "";

		for (int i = 2; i < input.length(); i++) {
			result += input.charAt(i);
		}

		return Integer.valueOf(result, 16);
	}
}
