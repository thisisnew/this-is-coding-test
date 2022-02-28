package baekjoon.basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex11170 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			int cnt = 0;

			for (int a = j; a <= k; a++) {
				String b = String.valueOf(a);
				char[] arr = generateCharArray(b);
				cnt += countTokens(arr);
			}

			System.out.println(cnt);
		}

	}

	private static char[] generateCharArray(String input) {
		char[] arr = new char[input.length()];

		for (int i = 0; i < input.length(); i++) {
			arr[i] = input.charAt(i);
		}

		return arr;
	}

	private static int countTokens(char[] array) {

		int cnt = 0;

		for (char c : array) {
			if (c == '0') {
				cnt++;
			}
		}

		return cnt;
	}
}
