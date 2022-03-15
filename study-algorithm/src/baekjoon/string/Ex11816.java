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

		String answer = input;

		if (i0 == '0') {

			if (i1 == 'X') {
				answer = calculateHexadecimalToDeciaml(answer);
			} else {
				answer = calculateHexadecimalToDeciaml(answer);
			}

		}

		System.out.println(answer);
	}

	static String calculateOctalToDecimal(String input) {
		return String.valueOf(Integer.valueOf(Integer.parseInt(input.substring(1), 8)));
	}

	static String calculateHexadecimalToDeciaml(String input) {
		return String.valueOf(Integer.valueOf(Integer.parseInt(input.substring(2), 16)));
	}
}
