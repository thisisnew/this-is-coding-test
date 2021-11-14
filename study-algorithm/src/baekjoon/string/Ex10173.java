package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10173 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String input = br.readLine();

			if (input.equals("EOI")) {
				break;
			}

			input = input.toUpperCase();

			if (input.contains("NEMO")) {
				System.out.println("Found");
			} else {
				System.out.println("Missing");
			}
		}
	}
}
