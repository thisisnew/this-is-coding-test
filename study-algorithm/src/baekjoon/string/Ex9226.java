package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex9226 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String input = br.readLine();
			String result = input;

			if (input.equals("#")) {
				break;
			}

			if (!input.contains("a") && !input.contains("e") && !input.contains("i") && !input.contains("o") && !input.contains("u")) {
				System.out.println(result + "ay");
				continue;
			} else {
				for (int i = 0; i < input.length(); i++) {
					char c = input.charAt(i);
					
					switch (c) {
					case 'a': {
						break;
					}
					case 'e': {
						break;
					}
					case 'i': {
						break;
					}
					case 'o': {
						break;
					}
					case 'u': {
						break;
					}
					default: {
						result = input.substring(i + 1) + input.substring(0, i + 1);
						break;
					}
					}
					
					System.out.println(result + "ay");
					break;
				}				
			}
		}
	}
}
