package baekjoon.basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5554 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = 0;

		for (int i = 0; i < 4; i++) {
			int duration = Integer.parseInt(br.readLine());
			total += duration;
		}

		int min = total / 60;
		int sec = total % 60;

		System.out.println(min);
		System.out.println(sec);
	}
}
