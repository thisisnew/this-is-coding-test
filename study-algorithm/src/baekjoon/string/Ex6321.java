package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6321 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int s = Integer.parseInt(br.readLine());

		for (int i = 0; i < s; i++) {
			String input = br.readLine();
			String output = "";

			for (int j = 0; j < input.length(); j++) {
				char c = input.charAt(j);
				c++;

				if (c == 91) {
					c = 65;
				}

				output += c;
			}

			System.out.println("String #" + (i + 1));
			System.out.println(output);
			System.out.println();
		}
	}
}
