package baekjoon.ifstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2753 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input =Integer.parseInt(br.readLine());
		int answer = 0;
		
		if(input % 4 == 0) {
			if(input % 100 != 0 || input % 400 == 0) {
				answer = 1;
			}
		}
		
		
		System.out.println(answer);
		
	}
}
