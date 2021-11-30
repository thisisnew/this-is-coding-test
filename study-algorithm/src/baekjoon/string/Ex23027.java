package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;

public class Ex23027 {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		if (input.contains("A")) {
			input = input.replaceAll("B", "A");
			input = input.replaceAll("C", "A");
			input = input.replaceAll("D", "A");
			input = input.replaceAll("F", "A");
		} else if (!input.contains("A") && input.contains("B")) {
			input = input.replaceAll("C", "B");
			input = input.replaceAll("D", "B");
			input = input.replaceAll("F", "B");
		} else if (!input.contains("A") && !input.contains("B") && input.contains("C")) {
			input = input.replaceAll("D", "C");
			input = input.replaceAll("F", "C");
		} else if (!input.contains("A") && !input.contains("B") && !input.contains("C")) {
			input = input.replaceAll(input, "A");
		}

		System.out.println(input);
	}

}
