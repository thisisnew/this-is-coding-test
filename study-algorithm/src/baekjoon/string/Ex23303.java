package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex23303 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		input = input.toUpperCase();

		if (input.contains("D2")) {
			System.out.println("D2");
		} else {
			System.out.println("unrated");
		}

	}
}
