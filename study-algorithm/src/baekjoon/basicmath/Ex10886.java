package baekjoon.basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10886 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int notCute = 0;
		int cute = 0;

		for (int i = 0; i < n; i++) {
			int input = Integer.parseInt(br.readLine());

			if (input == 0) {
				notCute++;
			} else {
				cute++;
			}
		}

		if (notCute > cute) {
			System.out.println("Junhee is not cute!");
		} else {
			System.out.println("Junhee is cute!");
		}

	}
}
