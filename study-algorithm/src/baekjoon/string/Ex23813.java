package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;

public class Ex23813 {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		int total = 0;
		
		while (true) {
			String turnInput = turnInput(input);

			total += Integer.parseInt(turnInput);

			if (turnInput.equals(input)) {
				break;
			}
		}

		
		System.out.println(total);
	}

	private static String turnInput(String input) {

		char[] arr = new char[input.length()];

		for (int i = 0; i < input.length(); i++) {
			arr[i] = input.charAt(i);
		}

		char c = arr[arr.length - 1];
		arr[arr.length - 1] = arr[0];
		arr[0] = c;

		return new String(arr);
	}
}
