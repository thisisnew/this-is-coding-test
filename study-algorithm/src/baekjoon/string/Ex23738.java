package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex23738 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		String result = "";

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			result += translate(c);
		}

		System.out.println(result);
	}

	private static String translate(char c) {

		switch (c) {
		case 'B': {
			return "v";
		}
		case 'E': {
			return "ye";
		}
		case 'H': {
			return "n";
		}
		case 'P': {
			return "r";
		}
		case 'C': {
			return "s";
		}
		case 'Y': {
			return "u";
		}
		case 'X': {
			return "h";
		}
		}

		return String.valueOf(c).toLowerCase();
	}
}
