package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;

public class Ex14711 {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int number = Integer.parseInt(br.readLine());
		String input = br.readLine();

		for (int i = 0; i < number; i++) {
			System.out.println(input);
			input = reversTiles(input);
		}
	}

	private static String reversTiles(String input) {

		String out = "";

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (c == '.') {
				out += '#';
			} else {
				out += '.';
			}
		}

		return out;
	}
}
