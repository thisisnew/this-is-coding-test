package baekjoon.basicmath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex10178 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int round = Integer.parseInt(br.readLine());

		for (int i = 0; i < round; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int c = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			int divide = c / v;
			int remain = c % v;

			System.out.println("You get" + " " + divide + " piece(s) and your dad gets " + remain + " piece(s).");
		}

	}
}
