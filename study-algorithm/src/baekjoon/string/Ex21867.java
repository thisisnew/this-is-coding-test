package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex21867 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			char c = input.charAt(i);

			if (c != 'J' && c != 'A' && c != 'V') {
				sb.append(c);
			}

		}

		if (sb.length() == 0) {
			System.out.println("nojava");
		} else {
			System.out.println(sb.toString());
		}

	}
}
