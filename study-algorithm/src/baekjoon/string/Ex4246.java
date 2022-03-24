package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4246 {

	static int n = 0;
	static int len = 0;
	static String input;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			n = Integer.parseInt(br.readLine());

			if (n == 0) {
				break;
			}

			input = br.readLine();
			len = input.length() / n;

			char[][] arr = makeArr(input);

			print(arr);
		}
	}

	private static char[][] makeArr(String input) {

		char[][] arr = new char[len][n];
		boolean isReverse = false;
		int lat = 0;
		int lon = 0;

		for (int i = 0; i < input.length(); i++) {

			char c = input.charAt(i);

			if (isReverse) {
				arr[lon][n - lat - 1] = c;
			} else {
				arr[lon][lat] = c;
			}

			lat++;

			if (lat == n) {
				isReverse = !isReverse;
				lon++;
				lat = 0;
			}
		}

		return arr;
	}

	private static void print(char[][] arr) {

		String result = "";
		int lat = 0;
		int lon = 0;

		for (int i = 0; i < input.length(); i++) {

			result += arr[lon][lat];

			lon++;

			if (lon == len) {
				lat++;
				lon = 0;
			}

		}

		System.out.println(result);
	}
}
