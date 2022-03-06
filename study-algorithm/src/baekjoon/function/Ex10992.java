package baekjoon.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10992 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int stars = 1;
		
		for (int i = 0; i < n; i++) {
			
			if(i == 0) {
				drawFirstStar(stars);
				
				continue;
			}
			
			if (i == n - 1) {
				drawStarsAll(stars);
			} else {
				drawStarsStartAndEnd(stars);
			}
		}
	}

	static void drawFirstStar(int stars) {

		int n = stars;

		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}

	}
	
	static void drawStarsAll(int stars) {

		int n = stars * 2 - 1;

		for (int i = 0; i < n; i++) {
			if (i == 0 || i == n - 1) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}

	}
	
	static void drawStarsStartAndEnd(int stars) {

		int n = stars * 2 - 1;

		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}

	}

	

}
