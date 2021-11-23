package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex7567 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		char prev = input.charAt(0);
		int sum = 10;
		
		for (int i = 1; i < input.length(); i++) {
			char next = input.charAt(i);

			if (prev != next) {
				sum += 10;
			} else {
				sum += 5;
			}

			prev = next;
		}

		System.out.println(sum);
	}
}
