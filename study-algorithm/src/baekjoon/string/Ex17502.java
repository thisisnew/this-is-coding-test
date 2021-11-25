package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;

public class Ex17502 {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();

		for (int i = 0; i < n; i++) {
			char c = input.charAt(i);

			if (c == '?') {
				c = input.charAt(n - i - 1);
				if (c == '?') {
					System.out.print('a');
				} else {
					System.out.print(c);
				}

			} else {
				System.out.print(c);
			}
		}

	}

}
