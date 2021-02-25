package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11719 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		int cnt = 1;
		
		while((input = br.readLine()) != null || cnt <=100) {
			
			if(input == null) {
				System.out.println();
			} else {
				System.out.println(input);
			}
			cnt++;
		}
		
	}
}
