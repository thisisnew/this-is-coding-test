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
	
	//8진수
	static int calculateOctalToDecimal(String input) {
		return Integer.valueOf(Integer.parseInt(input.substring(1),8));
	}

	//16진수
	static int calculateHexadecimalToDeciaml(String input) {
		return Integer.valueOf(Integer.parseInt(input.substring(2),16));
	}
}
