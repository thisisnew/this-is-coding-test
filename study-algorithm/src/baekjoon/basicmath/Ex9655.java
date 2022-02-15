package baekjoon.basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex9655 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int input = Integer.parseInt(br.readLine());

		if (input % 2 == 0) {
			System.out.println("CY");
		} else {
			System.out.println("SK");
		}

	}
}
