package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11816 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		if (input.charAt(0) != '0') {
			System.out.println(input);
		} else {
			if (input.charAt(1) != 'X') {
				System.out.println(Integer.valueOf(Integer.parseInt(input.substring(1), 8)));
			} else {
				System.out.println(Integer.valueOf(Integer.parseInt(input.substring(2), 16)));
			}
		}
	}
}
