package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10988 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		char[] arr = new char[input.length()];

		for (int i = input.length() - 1; i >= 0; i--) {
			arr[(input.length() - 1) - i] = input.charAt(i);
		}

		boolean isPalindrome = true;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != input.charAt(i)) {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}
