package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;

public class Ex7120 {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		String result = "";

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (result.length() > 0 && result.charAt(result.length() - 1) == c) {
				continue;
			}

			result += c;
		}

		System.out.println(result);
	}
}
