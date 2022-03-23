package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex16205 {

	static final int CAMEL_CASE = 1;
	static final int SNAKE_CASE = 2;
	static final int PASCAL_CASE = 3;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		String input = st.nextToken();

		String word = splitWord(input, n);

		printCamelCase(word);
		printSnakeCase(word);
		printPascalCase(word);
	}

	private static String splitWord(String input, int n) {

		String word = "";

		switch (n) {
		case CAMEL_CASE: {

			for (int i = 0; i < input.length(); i++) {

				char c = input.charAt(i);

				if (c >= 'A' && c <= 'Z') {
					word += "_";
				}

				word += c;
			}

			break;
		}

		case SNAKE_CASE: {
			word = input;

			break;
		}

		case PASCAL_CASE: {

			for (int i = 0; i < input.length(); i++) {

				char c = input.charAt(i);

				if (i > 0 && c >= 'A' && c <= 'Z') {
					word += "_";
				}

				word += c;
			}

			break;
		}
		}

		return word.toLowerCase();
	}

	private static void printCamelCase(String word) {

		String camel = "";
		String[] words = word.split("_");

		for (int i = 0; i < words.length; i++) {
			String wordProp = words[i];

			if (i == 0) {
				camel += wordProp;
				continue;
			}

			String first = wordProp.substring(0, 1).toUpperCase();
			String remain = wordProp.substring(1);

			camel += (first + remain);
		}

		System.out.println(camel);
	}

	private static void printSnakeCase(String word) {
		System.out.println(word);
	}

	private static void printPascalCase(String word) {
		String pascal = "";
		String[] words = word.split("_");

		for (int i = 0; i < words.length; i++) {
			String wordProp = words[i];
			String first = wordProp.substring(0, 1).toUpperCase();
			String remain = wordProp.substring(1);

			pascal += (first + remain);
		}

		System.out.println(pascal);
	}
}
