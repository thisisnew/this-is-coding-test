package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Ex9226 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] cArr = { 'a', 'e', 'i', 'o', 'u' };

		while (true) {
			String input = br.readLine();

			if (input.equals("#")) {
				break;
			}

			Queue<Character> q = new LinkedList<Character>();

			for (int i = 0; i < input.length(); i++) {
				q.add(input.charAt(i));
			}

			while (true) {
				char c = q.poll();
				switch (c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					break;
				}
				q.add(c);
			}
			
			//String result = q.toString();
			//System.out.println(result + "ay");
		}
	}
}
