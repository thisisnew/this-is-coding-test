package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex21964 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();

		
		if(n > 5) {
			System.out.println(input.substring(input.length()-5, input.length()));
		}else {
			System.out.println(input);
		}
	}
}
