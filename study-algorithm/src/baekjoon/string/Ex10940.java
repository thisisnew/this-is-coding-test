package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10940 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		convertStringToHex(input);

	}

	private static void convertStringToHex(String str) {
		StringBuilder stringBuilder = new StringBuilder();

		char[] charArray = str.toCharArray();

		for (char c : charArray) {
			String charToHex = Integer.toHexString(c);
			stringBuilder.append(charToHex);
		}

		System.out.println(stringBuilder.toString().toUpperCase());
	}
}
