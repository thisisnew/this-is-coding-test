package baekjoon.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10992 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int stars = Integer.parseInt(br.readLine());

		for (int i = 0; i < stars; i++) {

			if (i == 0) {
				drawFirstStar(stars);
				continue;
			}

			if (i == stars - 1) {
				drawStarsAll(stars);
				System.out.println();
				continue;
			}

			drawStarsStartAndEnd(stars);
			System.out.println();
		}
	}

	static void drawFirstStar(int stars) {

		int n = stars;

		for (int i = 1; i < n; i++) {
			System.out.print(" ");
		}

		System.out.println("*");
	}

	static void drawStarsAll(int stars) {

		int n = stars * 2 - 1;

		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}

	}

	static void drawStarsStartAndEnd(int stars) {

		int n = stars * 2 - 1;

		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}

	}

}
